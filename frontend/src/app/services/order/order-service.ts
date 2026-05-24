import { Injectable } from '@angular/core';
import { Order } from 'app/models/order';
import { BaseService } from '../base/base-service';

@Injectable({
  providedIn: 'root',
})
export class OrderService extends BaseService<Order> {
  override resource: string = "orders";
}
