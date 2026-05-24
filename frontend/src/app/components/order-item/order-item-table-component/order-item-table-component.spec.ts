import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderItemTableComponent } from './order-item-table-component';

describe('OrderItemTableComponent', () => {
  let component: OrderItemTableComponent;
  let fixture: ComponentFixture<OrderItemTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OrderItemTableComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(OrderItemTableComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
