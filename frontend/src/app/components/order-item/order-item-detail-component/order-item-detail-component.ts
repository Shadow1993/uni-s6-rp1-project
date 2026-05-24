import { Component, inject } from '@angular/core';
import { BaseDetail } from 'app/components/base/base-detail/base-detail';
import { OrderItem } from 'app/models/order-item';
import { BaseService } from 'app/services/base/base-service';
import { OrderItemService } from 'app/services/order-item/order-item-service';

@Component({
  selector: 'app-order-item-detail-component',
  imports: [],
  templateUrl: './order-item-detail-component.html',
  styleUrl: './order-item-detail-component.scss',
})
export class OrderItemDetailComponent extends BaseDetail<OrderItem> {
  protected override service: OrderItemService = inject(OrderItemService);
}
