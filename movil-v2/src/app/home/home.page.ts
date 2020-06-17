import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { Storage } from '@ionic/storage';
import {  MenuController } from '@ionic/angular';


@Component({
  selector: 'app-home',
  templateUrl: './home.page.html',
  styleUrls: ['./home.page.scss'],
})
export class HomePage implements OnInit {

  constructor(private storage: Storage, private router: Router,
    private menuController: MenuController) { }

  ngOnInit() {
  }

  cerrarSesion(){
    this.storage.remove('usuarioLogueado')
    this.menuController.enable(false)
    this.router.navigate(['inicio-sesion'])
  }

}
