import { Component, inject } from '@angular/core';
import { BaseDetail } from 'app/components/base/base-detail/base-detail';
import { Item } from 'app/models/item';
import { ItemService } from 'app/services/item/item-service';

@Component({
  selector: 'app-item-detail-component',
  imports: [],
  templateUrl: './item-detail-component.html',
  styleUrl: './item-detail-component.scss',
})
export class ItemDetailComponent extends BaseDetail<Item> {
  protected override service: ItemService = inject(ItemService);
}
