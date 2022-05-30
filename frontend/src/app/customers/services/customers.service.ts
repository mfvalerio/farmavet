import { environment } from './../../../environments/environment.prod';
import { HttpClient } from '@angular/common/http';
import { Customer } from './../model/customer';
import { Injectable } from '@angular/core';
import { tap } from 'rxjs/operators';
import { first } from 'rxjs/operators';
import { delay } from 'rxjs/operators';
import { MatSort } from '@angular/material/sort';



@Injectable({
  providedIn: 'root'
})
export class CustomersService {

  private readonly API = 'farmavet/customers';

  constructor(private httpClient: HttpClient) { }

  findAll() {
    return this.httpClient.get<Customer[]>(this.API)
    .pipe(
      first(),
      delay(1000),
      tap(customers => console.log(customers))
    );
  }

  insert(record: Customer){
    return this.httpClient.post<Customer>(this.API, record);
  }
}
