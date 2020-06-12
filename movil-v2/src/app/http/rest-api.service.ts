import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders  } from '@angular/common/http';
import { print } from 'util';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RestApiService {

  apiURL:string = 'http://demo4930225.mockable.io';
  handleError: object

  constructor(private http: HttpClient) { }

  funcionLogin(objectoLogin){
    return this.http.post(this.apiURL+"/login", objectoLogin)
  }

  funcionListaMascota(objetoLogueado){
    var header = this.funcionConstruirHeader(objetoLogueado['sessionToken'])
    return this.http.get(this.apiURL+"/mascotas?usarioId=" + objetoLogueado['id'], 
                         header)
  }

  funcionConstruirHeader(token:string){  
    return {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'token': token
      })
    }  
  }
}
