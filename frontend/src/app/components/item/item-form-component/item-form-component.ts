import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { BaseForm } from 'app/components/base/base-form/base-form';
import { Item } from 'app/models/item';
import { ItemService } from 'app/services/item/item-service';

@Component({
  selector: 'app-item-form-component',
  imports: [ReactiveFormsModule],
  templateUrl: './item-form-component.html',
  styleUrl: './item-form-component.scss',
})
export class ItemFormComponent extends BaseForm<Item> {
  protected override service: ItemService = inject(ItemService);
  protected override urlRoute: string = "items";
  override entity = new FormGroup({
    name: new FormControl(""),
    price: new FormControl("")
  });
}
