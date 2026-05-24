import { Routes } from '@angular/router';
import { HomeComponent } from './components/home-component/home-component';
import { ItemTableComponent } from './components/item/item-table-component/item-table-component';
import { ItemFormComponent } from './components/item/item-form-component/item-form-component';
import { ItemDetailComponent } from './components/item/item-detail-component/item-detail-component';
import { OrderFormComponent } from './components/order/order-form-component/order-form-component';
import { OrderDetailComponent } from './components/order/order-detail-component/order-detail-component';
import { OrderTableComponent } from './components/order/order-table-component/order-table-component';
import { OrderItemFormComponent } from './components/order-item/order-item-form-component/order-item-form-component';
import { OrderItemDetailComponent } from './components/order-item/order-item-detail-component/order-item-detail-component';
import { OrderItemTableComponent } from './components/order-item/order-item-table-component/order-item-table-component';

export const routes: Routes = [{
        path: "",
        component: HomeComponent
    },
    {
        path: "items/new",
        component: ItemFormComponent,
        pathMatch: 'full'
    },
    {
        path: "items/:id/edit",
        component: ItemFormComponent,
        pathMatch: 'full'
    },
    {
        path: "items/:id",
        component: ItemDetailComponent
    },
    {
        path: "items",
        component: ItemTableComponent
    },
    {
        path: "orders/new",
        component: OrderFormComponent,
        pathMatch: 'full'
    },
    {
        path: "orders/:id/edit",
        component: OrderFormComponent,
        pathMatch: 'full'
    },
    {
        path: "orders/:id",
        component: OrderDetailComponent
    },
    {
        path: "orders",
        component: OrderTableComponent
    },
    {
        path: "orderitems/new",
        component: OrderItemFormComponent,
        pathMatch: 'full'
    },
    {
        path: "orderitems/:id/edit",
        component: OrderItemFormComponent,
        pathMatch: 'full'
    },
    {
        path: "orderitems/:id",
        component: OrderItemDetailComponent
    },
    {
        path: "orderitems",
        component: OrderItemTableComponent
    }
];
