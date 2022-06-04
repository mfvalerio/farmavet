import { CustomersService } from './../services/customers.service';
import { Customer } from './../model/customer';
import { Component, OnInit } from '@angular/core';
import { BehaviorSubject, catchError, of } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.scss']
})
export class CustomersComponent implements OnInit {

  customers$ = new BehaviorSubject<Customer[]>([]);
  displayedColumns = ['id', 'name', 'cpf', 'telephone', 'telephoneForMessages', 'cep', 'streetName', 'number', 'neighborhood', 'city', 'pet', 'actions'];


  constructor(
    private customersService: CustomersService,
    public dialog: MatDialog,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.customersService.findAllCustomersPets()
      .pipe(
        catchError(error => {
          this.onError("Falha no carregamento.");
          return of([])
        })
      );
      
    this.customersService.findAllCustomers()
      .subscribe({
        next: (customer) => {
          this.customersService.findAllCustomersPets()
          .subscribe({
              next: (petInfo) => {
                customer.forEach(c => c.pet = petInfo.filter(p => p.customerId === c.id));
                const final = customer.sort((a: any, b: any) => a.name - b.name);
                this.customers$.next(final);
              },
              error: (error) => this.onError("Falha no carregamento.")
          })
        },
        error: (error) => this.onError("Falha no carregamento.")
      })

  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg
    });
  }

  ngOnInit(): void {

  }

  onAdd() {
    this.router.navigate(['new'], { relativeTo: this.route });
  }

  onUpdate(customer: Customer) {
    this.router.navigate(['update'], { relativeTo: this.route });
    
  }

  openDoguinhoModal(customer: Customer) {
    console.log("opa")
    console.log(customer);
  }

}
