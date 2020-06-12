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

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }  

  constructor(private http: HttpClient) { }

  functionLogin(objectoLogin){
    return this.http.post(this.apiURL+"/login", objectoLogin)
  }

}
