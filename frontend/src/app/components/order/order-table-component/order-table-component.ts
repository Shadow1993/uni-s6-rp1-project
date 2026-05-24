import { Component, inject } from '@angular/core';
import { BaseTable } from 'app/components/base/base-table/base-table';
import { Order } from 'app/models/order';
import { OrderService } from 'app/services/order/order-service';

@Component({
  selector: 'app-order-table-component',
  imports: [],
  templateUrl: './order-table-component.html',
  styleUrl: './order-table-component.scss',
})
export class OrderTableComponent extends BaseTable<Order> {
  protected override service: OrderService = inject(OrderService);
  protected override urlRoute: string = "orders";
}
