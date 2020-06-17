import { Component, OnInit } from '@angular/core';
import { AlertController } from '@ionic/angular';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { RestApiService } from '../http/rest-api.service';
import { Storage } from '@ionic/storage';

@Component({
  selector: 'app-disponbilidad',
  templateUrl: './disponbilidad.page.html',
  styleUrls: ['./disponbilidad.page.scss'],
})
export class DisponbilidadPage implements OnInit {

  servicios:object
  idServicio: string 
  fecha: string
  token:string
  listaDisponibilidades:object
  objetoDisponibilidad:object
  constructor(private alertController: AlertController, private restApiService:RestApiService, private storage:Storage, private router:Router) { }

  ngOnInit() {
    this.storage.get('usuarioLogueado').then( user => this.restApiService.funcionServicios(user).subscribe((data)=>{
      this.servicios = data ['data']
      this.token = user['sessionToken']
      },
      error =>{
        alert('error')
      }
      ))
  }

  disponibilidadServicio(){
    this.objetoDisponibilidad = {
      'idServicio': this.idServicio,
      'fecha': this.fecha,
      'sessionToken': this.token
    }

    var respuestaHttp = this.restApiService.funcionListaDisponibilidad(this.objetoDisponibilidad).subscribe((data)=>{
      this.listaDisponibilidades = data
    },
    error =>{
    ('error')
    })
  }

  async presentAlertConfirm() {
    const alert = await this.alertController.create({
      header: 'Agendar cita',
      message: 'Esta seguro de agendar la cita?',
      buttons: [
        {
          text: 'SI',
          role: 'cancel',
          cssClass: 'secondary',
          handler: (blah) => {
            console.log('Cita Agendada');
          }
        }, {
          text: 'NO',
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
