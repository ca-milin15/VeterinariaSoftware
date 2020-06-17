import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NavigationExtras } from '@angular/router/src/router';
import { RestApiService } from '../http/rest-api.service';
import { Storage } from '@ionic/storage';
import {  MenuController } from '@ionic/angular';

@Component({
  selector: 'app-mascota',
  templateUrl: './mascota.page.html',
  styleUrls: ['./mascota.page.scss'],
})
export class MascotaPage implements OnInit {

  objetoListaMascota: object
  usuarioLogueado: string
  listaMascota: any

  constructor(private router: Router,
              private restApiService: RestApiService,
              private storage: Storage,
              private menuController: MenuController) { }

  ngOnInit() {
    this.storage.get('usuarioLogueado').then(
      res => this.restApiService.funcionListaMascota(res).subscribe((data) => {
        this.listaMascota = data['data']
      }, error => {
        alert(JSON.stringify(error))
      })
    )
  }

  verCarnet(carnet){
    let paramsToCarnet: NavigationExtras = {
      queryParams:{
      'infoMascota': JSON.stringify(carnet)
      }
    }
    this.router.navigate(['carnet'], paramsToCarnet);
  }

  cerrarSesion(){
    this.storage.remove('usuarioLogueado')
    this.menuController.enable(false)
    this.router.navigate(['inicio-sesion'])
  }
  
}
