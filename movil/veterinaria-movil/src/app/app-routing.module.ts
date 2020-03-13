import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'inicio-sesion', pathMatch: 'full' },
  { path: 'home', loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)},
  {
    path: 'inicio-sesion',
    loadChildren: () => import('./inicio-sesion/inicio-sesion.module').then( m => m.InicioSesionPageModule)
  },
  {
    path: 'servicio',
    loadChildren: () => import('./servicio/servicio.module').then( m => m.ServicioPageModule)
  },
  {
    path: 'cita',
    loadChildren: () => import('./cita/cita.module').then( m => m.CitaPageModule)
  },
  {
    path: 'disponibilidad',
    loadChildren: () => import('./disponibilidad/disponibilidad.module').then( m => m.DisponibilidadPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
