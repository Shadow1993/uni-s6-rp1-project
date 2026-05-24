import { Injectable } from '@angular/core';
import { BaseService } from '../base/base-service';
import { Item } from 'app/models/item';

@Injectable({
  providedIn: 'root',
})
export class ItemService extends BaseService<Item> {
  override resource: string = "items";
}
