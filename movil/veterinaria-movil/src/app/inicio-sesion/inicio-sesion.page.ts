import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';

@Component({
  selector: 'app-inicio-sesion',
  templateUrl: './inicio-sesion.page.html',
  styleUrls: ['./inicio-sesion.page.scss'],
})

export class InicioSesionPage implements OnInit {
  loginObject: any
  constructor(
    private router: Router) {}

  ngOnInit() {
    this.loginObject={}
  }

  iniciarSesion(loginObject){
    alert(JSON.stringify(loginObject))
    this.router.navigate(['home'])
  }
}
