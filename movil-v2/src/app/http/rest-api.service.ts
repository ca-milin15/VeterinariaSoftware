import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders  } from '@angular/common/http';
import { print } from 'util';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RestApiService {

  apiURL:string = 'http://demo0468101.mockable.io';
  handleError: object

  constructor(private http: HttpClient) { }

  funcionLogin(objectoLogin){
    return this.http.post(this.apiURL+"/login", objectoLogin)
  }

  funcionListaMascota(objetoLogueado){
    var header = this.funcionConstruirHeader(objetoLogueado['sessionToken'])
    return this.http.get(this.apiURL+"/mascotas?usuarioId=" + objetoLogueado['id'],header)
  }

  funcionCitaMascota (objetoLogueado) {
    var header = this.funcionConstruirHeader(objetoLogueado['sessionToken'])
    return this.http.get(this.apiURL+"/citasmascota?usuarioId="+ objetoLogueado['id'],header)
  }

  funcionServicios (objetoLogueado) {
    var header = this.funcionConstruirHeader(objetoLogueado['sessionToken'])
    return this.http.get(this.apiURL+"/servicio",header)
  }

  funcionListaDisponibilidad (objetoDisponibilidad) {
    var header = this.funcionConstruirHeader(objetoDisponibilidad['sessionToken'])
    return this.http.get(this.apiURL+"/listaDisponibilidad?idServicio="+objetoDisponibilidad['idServicio']+"&fecha="+objetoDisponibilidad['fecha'],header)
  }

  private funcionConstruirHeader(token:string){  
    return {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'token': token
      })
    }  
  }
}
