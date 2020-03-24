import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';

@Component({
  selector: 'app-inicio-sesion',
  templateUrl: './inicio-sesion.page.html',
  styleUrls: ['./inicio-sesion.page.scss'],
})
export class InicioSesionPage implements OnInit {

  constructor(
    private router: Router
  ) { }

  ngOnInit() {
  }

  iniciarSesion(loginObject){
    this.router.navigate(['home'])
  }
}
