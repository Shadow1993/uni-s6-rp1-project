import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderItemDetailComponent } from './order-item-detail-component';

describe('OrderItemDetailComponent', () => {
  let component: OrderItemDetailComponent;
  let fixture: ComponentFixture<OrderItemDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OrderItemDetailComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(OrderItemDetailComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
