import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders  } from '@angular/common/http';
import { print } from 'util';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RestApiService {

  apiURL:string = 'http://13.65.208.101/api';
  handleError: object

  constructor(private http: HttpClient) { }

  funcionLogin(objectoLogin){
    return this.http.post(this.apiURL+"/login", objectoLogin)
  }

  funcionListaMascota(objetoLogueado){
    var header = this.funcionConstruirHeader(objetoLogueado['sessionToken'])
    return this.http.get(this.apiURL+"/pet",header)
  }

  funcionCitaMascota (objetoLogueado) {
    var header = this.funcionConstruirHeader(objetoLogueado['sessionToken'])
    return this.http.get(this.apiURL+"/appointment",header)
  }

  funcionServicios (objetoLogueado) {
    var header = this.funcionConstruirHeader(objetoLogueado['sessionToken'])
    return this.http.get(this.apiURL+"/service",header)
  }

  funcionListaDisponibilidad (objetoDisponibilidad) {
    var header = this.funcionConstruirHeader(objetoDisponibilidad['sessionToken'])
    return this.http.get(this.apiURL+"/availability",header)
  }

  private funcionConstruirHeader(token:string){  
    return {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'x-access-token': token
      })
    }  
  }
}
