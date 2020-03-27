import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NavigationExtras } from '@angular/router/src/router';

@Component({
  selector: 'app-mascota',
  templateUrl: './mascota.page.html',
  styleUrls: ['./mascota.page.scss'],
})
export class MascotaPage implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  verCarnet(nombreMascota){
    let infoMascota = {
      'nombreMascota': nombreMascota
    }
    let paramsToCarnet: NavigationExtras = {
      queryParams:{
      'infoMascota': JSON.stringify(infoMascota)
      }
    }
    this.router.navigate(['carnet'], paramsToCarnet);
  }
}
