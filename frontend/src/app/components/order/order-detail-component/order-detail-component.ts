import { Component, inject } from '@angular/core';
import { BaseDetail } from 'app/components/base/base-detail/base-detail';
import { Order } from 'app/models/order';
import { OrderService } from 'app/services/order/order-service';

@Component({
  selector: 'app-order-detail-component',
  imports: [],
  templateUrl: './order-detail-component.html',
  styleUrl: './order-detail-component.scss',
})
export class OrderDetailComponent extends BaseDetail<Order> {
  protected override service: OrderService = inject(OrderService);
}
