import { Component, inject } from '@angular/core';
import { BaseTable } from 'app/components/base/base-table/base-table';
import { Item } from 'app/models/item';
import { ItemService } from 'app/services/item/item-service';

@Component({
  selector: 'app-item-table-component',
  imports: [],
  templateUrl: './item-table-component.html',
  styleUrl: './item-table-component.scss',
})
export class ItemTableComponent extends BaseTable<Item> {
  protected override service: ItemService = inject(ItemService);
  protected override urlRoute: string = "items";
}
