import { Injectable } from '@angular/core';
import { BaseService } from '../base/base-service';
import { OrderItem } from 'app/models/order-item';

@Injectable({
  providedIn: 'root',
})
export class OrderItemService extends BaseService<OrderItem> {
  override resource: string = "orderitems";
}
