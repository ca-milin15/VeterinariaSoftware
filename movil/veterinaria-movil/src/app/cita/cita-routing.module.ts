import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CitaPage } from './cita.page';

const routes: Routes = [
  {
    path: '',
    component: CitaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CitaPageRoutingModule {}
