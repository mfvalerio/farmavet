import { HttpClient } from '@angular/common/http';
import { Customer, PetInfo } from './../model/customer';
import { Injectable } from '@angular/core';
import { tap } from 'rxjs/operators';
import { first } from 'rxjs/operators';
import { delay } from 'rxjs/operators';



@Injectable({
  providedIn: 'root'
})
export class CustomersService {

  private readonly API_CUSTOMERS = 'farmavet/customers';
  private readonly API_PETS = 'farmavet/pets';


  constructor(private httpClient: HttpClient) { }

  findAllCustomers() {
    return this.httpClient.get<Customer[]>(this.API_CUSTOMERS)
      .pipe(
        first(),
        delay(1000),
        tap(customer => {
          console.log(customer)
        })
      );
  }

  findAllCustomersPets() {
    return this.httpClient.get<PetInfo[]>(this.API_PETS)
      .pipe(
        first(),
        delay(1000),
        tap(petInfo => console.log(petInfo))
      );
  }

  insert(record: Customer) {
    return this.httpClient.post<Customer>(this.API_CUSTOMERS, record);
  }
}
