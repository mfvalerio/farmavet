import { CustomersService } from './../services/customers.service';
import { Customer } from './../model/customer';
import { Component, OnInit } from '@angular/core';
import { catchError, Observable, of } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.scss']
})
export class CustomersComponent implements OnInit {

  customers$: Observable<Customer[]>;
  displayedColumns = ['id','name','cpf','telephone','telephoneForMessages','cep','streetName','number','neighborhood','city', 'actions'];


  constructor(
    private customersService: CustomersService,
    public dialog: MatDialog,
    private router: Router,
    private route: ActivatedRoute
    ) {
    this.customers$ = this.customersService.findAll()
    .pipe(
      catchError(error => {
        this.onError("Falha no carregamento.");
        return of([])
      })
    );

  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg
    });
  }

  ngOnInit(): void {

  }

  onAdd(){
    this.router.navigate(['new'], {relativeTo: this.route});
  }

}
