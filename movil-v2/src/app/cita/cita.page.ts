import { Component, OnInit } from '@angular/core';
import { AlertController } from '@ionic/angular';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { RestApiService } from '../http/rest-api.service';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-cita',
  templateUrl: './cita.page.html',
  styleUrls: ['./cita.page.scss'],
})
export class CitaPage implements OnInit {

  listaCita : object
  constructor(private alertController: AlertController, private restApiService:RestApiService, private storage:Storage, private router:Router) { }

  ngOnInit() {
    this.storage.get('usuarioLogueado').then( user => this.restApiService.funcionCitaMascota(user).subscribe((data)=>{
    this.listaCita = data ['data']
    },
    error =>{
      alert('error')
    }
    ))
  }


  async presentAlertConfirm() {
    const alert = await this.alertController.create({
      header: 'Alerta!',
      message: 'Esta seguro de cancelar la cita?',
      buttons: [
        {
          text: 'Cancelar',
          role: 'cancel',
          cssClass: 'secondary',
          handler: (blah) => {
            console.log('Cita sigue vigente');
          }
        }, {
          text: 'Confirmar',
          handler: () => {
            console.log('Cita cancelada');
          }
        }
      ]
    });

    await alert.present();
  }

  cerrarSesion(){
    this.storage.remove('usuarioLogueado')
    this.router.navigate(['inicio-sesion'])
  }

}
