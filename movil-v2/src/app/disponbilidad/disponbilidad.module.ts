import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';

import { IonicModule } from '@ionic/angular';

import { DisponbilidadPage } from './disponbilidad.page';

const routes: Routes = [
  {
    path: '',
    component: DisponbilidadPage
  }
];

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    RouterModule.forChild(routes)
  ],
  declarations: [DisponbilidadPage]
})
export class DisponbilidadPageModule {}
