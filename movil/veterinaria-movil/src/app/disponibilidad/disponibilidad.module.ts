import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DisponibilidadPageRoutingModule } from './disponibilidad-routing.module';

import { DisponibilidadPage } from './disponibilidad.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DisponibilidadPageRoutingModule
  ],
  declarations: [DisponibilidadPage]
})
export class DisponibilidadPageModule {}
