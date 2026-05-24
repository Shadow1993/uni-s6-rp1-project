import { BaseModel } from "./base-model";
import { OrderItem } from "./order-item";

export interface Order extends BaseModel {
    customerName: string;
    status: string;
    createdAt: string;
    orderItems: OrderItem[]
}