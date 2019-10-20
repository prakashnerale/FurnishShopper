import { Injectable } from '@angular/core';
import {Http, Headers} from '@angular/http';
import { Item } from '../models/item';


@Injectable({
  providedIn: 'root'
})
export class AddItemService {

  constructor(private http:Http) { }

  sendItem(book:Item) {
  	let url = "http://localhost:8080/item/add";
    
    let headers = new Headers ({
      'Content-Type': 'application/json',
      'x-auth-token' : localStorage.getItem('xAuthToken')
    });

    return this.http.post(url, JSON.stringify(book), {headers: headers});
  }

}
