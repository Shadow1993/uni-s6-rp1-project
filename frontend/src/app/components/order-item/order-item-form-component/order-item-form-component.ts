import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { BaseForm } from 'app/components/base/base-form/base-form';
import { OrderItem } from 'app/models/order-item';
import { OrderItemService } from 'app/services/order-item/order-item-service';

@Component({
  selector: 'app-order-item-form-component',
  imports: [ReactiveFormsModule],
  templateUrl: './order-item-form-component.html',
  styleUrl: './order-item-form-component.scss',
})
export class OrderItemFormComponent extends BaseForm<OrderItem> {
  protected override service: OrderItemService = inject(OrderItemService);
  protected override urlRoute: string = "orderitems";
  override entity = new FormGroup({
    quantity: new FormControl(0),
    item: new FormGroup({
      id: new FormControl(0)
    }),
    order: new FormGroup({
      id: new FormControl(0)
    })
  });
}
