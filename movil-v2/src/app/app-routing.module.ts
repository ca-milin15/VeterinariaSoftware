import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', loadChildren: './inicio-sesion/inicio-sesion.module#InicioSesionPageModule' },
  { path: 'inicio-sesion', loadChildren: './inicio-sesion/inicio-sesion.module#InicioSesionPageModule' },
  { path: 'cita', loadChildren: './cita/cita.module#CitaPageModule' },
  { path: 'home', loadChildren: './home/home.module#HomePageModule' },
  { path: 'disponbilidad', loadChildren: './disponbilidad/disponbilidad.module#DisponbilidadPageModule' },
  { path: 'mascota', loadChildren: './mascota/mascota.module#MascotaPageModule' }
];
@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
