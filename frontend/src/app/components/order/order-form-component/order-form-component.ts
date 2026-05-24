import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { BaseForm } from 'app/components/base/base-form/base-form';
import { Order } from 'app/models/order';
import { OrderService } from 'app/services/order/order-service';

@Component({
  selector: 'app-order-form-component',
  imports: [ReactiveFormsModule],
  templateUrl: './order-form-component.html',
  styleUrl: './order-form-component.scss',
})
export class OrderFormComponent extends BaseForm<Order> {
  protected override service: OrderService = inject(OrderService);
  protected override urlRoute: string = "orders";
  override entity = new FormGroup({
    customerName: new FormControl(""),
    status: new FormControl(""),
    createdAt: new FormControl("")
  });
}
