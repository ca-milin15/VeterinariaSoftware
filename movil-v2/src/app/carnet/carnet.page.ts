import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NavigationExtras } from '@angular/router/src/router';

@Component({
  selector: 'app-carnet',
  templateUrl: './carnet.page.html',
  styleUrls: ['./carnet.page.scss'],
})
export class CarnetPage implements OnInit {

  infoMascota: any

  constructor(private activatedRoute: ActivatedRoute, 
    private router: Router) { 
    this.activatedRoute.queryParams.subscribe(params => {
      this.infoMascota = JSON.parse(params.infoMascota);
    })
  }

  ngOnInit() {
  }

}
