import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import {RestApiService} from '../http/rest-api.service';
import { AlertController } from '@ionic/angular';
import { Storage } from '@ionic/storage';

@Component({
  selector: 'app-inicio-sesion',
  templateUrl: './inicio-sesion.page.html',
  styleUrls: ['./inicio-sesion.page.scss'],
})
export class InicioSesionPage implements OnInit {

  txtCedula: string
  txtClave: string
  objetoLogin: object

  constructor( private router: Router, 
               private restApiService: RestApiService,
               private alertController: AlertController, 
               private storage: Storage
              ) { 
  }

  ngOnInit() {
  }

  iniciarSesion(){
    this.objetoLogin = {
      'cedula': this.txtCedula,
      'contrasena': this.txtClave
    }
    var respuestaHttp = this.restApiService.funcionLogin(this.objetoLogin)
    .subscribe((response) => {
      this.storage.set('usuarioLogueado', response)
      this.router.navigate(['home'])
    }, (error) => {
      this.presentAlertConfirm()
    });
  }

  presentAlertConfirm() {
    this.alertController.create({
      cssClass: 'my-custom-class',
      header: 'Alerta!',
      message: 'Credenciales erradas.',
      buttons: [
        {
          text: 'Ok',
          handler: () => {
            console.log('Confirm Okay');
          }
        }
      ]
    }).then(alert=> alert.present());
  }
}
