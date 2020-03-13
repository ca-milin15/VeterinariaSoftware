import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DisponibilidadPage } from './disponibilidad.page';

const routes: Routes = [
  {
    path: '',
    component: DisponibilidadPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DisponibilidadPageRoutingModule {}
