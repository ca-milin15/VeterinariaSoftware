import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NavigationExtras } from '@angular/router/src/router';
import { RestApiService } from '../http/rest-api.service';
import { Storage } from '@ionic/storage';

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
              private storage: Storage) { }

  ngOnInit() {
    this.storage.get('usuarioLogueado').then(
      res => this.restApiService.funcionListaMascota(res).subscribe((data) => {
        this.listaMascota = data
      }, error => {
        alert('error')
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
}
