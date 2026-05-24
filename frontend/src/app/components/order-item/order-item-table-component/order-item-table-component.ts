import { Component, inject } from '@angular/core';
import { BaseTable } from 'app/components/base/base-table/base-table';
import { OrderItem } from 'app/models/order-item';
import { OrderItemService } from 'app/services/order-item/order-item-service';

@Component({
  selector: 'app-order-item-table-component',
  imports: [],
  templateUrl: './order-item-table-component.html',
  styleUrl: './order-item-table-component.scss',
})
export class OrderItemTableComponent extends BaseTable<OrderItem> {
  protected override service: OrderItemService = inject(OrderItemService);
  protected override urlRoute: string = "orderitems";
}
