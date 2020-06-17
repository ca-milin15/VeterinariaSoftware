import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NavigationExtras } from '@angular/router/src/router';
import { Storage } from '@ionic/storage';
import {  MenuController } from '@ionic/angular';

@Component({
  selector: 'app-carnet',
  templateUrl: './carnet.page.html',
  styleUrls: ['./carnet.page.scss'],
})
export class CarnetPage implements OnInit {

  infoMascota: any

  constructor(private activatedRoute: ActivatedRoute, 
              private router: Router,
              private storage:Storage,
              private menuController: MenuController) { 
    this.activatedRoute.queryParams.subscribe(params => {
      this.infoMascota = JSON.parse(params.infoMascota);
    })
  }

  ngOnInit() {
  }

  cerrarSesion(){
    this.storage.remove('usuarioLogueado')
    this.menuController.enable(false)
    this.router.navigate(['inicio-sesion'])
  }

}
