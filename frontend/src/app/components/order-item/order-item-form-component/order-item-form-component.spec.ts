import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderItemFormComponent } from './order-item-form-component';

describe('OrderItemFormComponent', () => {
  let component: OrderItemFormComponent;
  let fixture: ComponentFixture<OrderItemFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OrderItemFormComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(OrderItemFormComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
