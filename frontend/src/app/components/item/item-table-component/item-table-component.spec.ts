import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ItemTableComponent } from './item-table-component';

describe('ItemTableComponent', () => {
  let component: ItemTableComponent;
  let fixture: ComponentFixture<ItemTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ItemTableComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(ItemTableComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
