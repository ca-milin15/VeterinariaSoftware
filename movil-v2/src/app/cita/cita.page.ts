import { Component, OnInit } from '@angular/core';
import { AlertController } from '@ionic/angular';


@Component({
  selector: 'app-cita',
  templateUrl: './cita.page.html',
  styleUrls: ['./cita.page.scss'],
})
export class CitaPage implements OnInit {

  constructor(private alertController: AlertController) { 
  }

  ngOnInit() {
  }

  async presentAlertConfirm() {
    const alert = await this.alertController.create({
      header: 'Alerta!',
      message: 'Esta seguro de cancelar la cita?',
      buttons: [
        {
          text: 'Cancelar',
          role: 'cancel',
          cssClass: 'secondary',
          handler: (blah) => {
            console.log('Cita sigue vigente');
          }
        }, {
          text: 'Confirmar',
          handler: () => {
            console.log('Cita cancelada');
          }
        }
      ]
    });

    await alert.present();
  }
}
