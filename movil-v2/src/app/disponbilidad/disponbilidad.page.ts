import { Component, OnInit } from '@angular/core';
import { AlertController } from '@ionic/angular';
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
  objetoDisponibilidad:object
  constructor(private alertController: AlertController, private restApiService:RestApiService, private storage:Storage) { }

  ngOnInit() {
    this.storage.get('usuarioLogueado').then( user => this.restApiService.funcionServicios(user).subscribe((data)=>{
      this.servicios = data 
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

    var respuestaHttp = this.restApiService.funcionListaDisponibilidad(this.objetoDisponibilidad)
}
}
