import { BaseModel } from "./base-model";
import { OrderItem } from "./order-item";

export interface Item extends BaseModel {
    name: string;
    price: number;
    orderItems: OrderItem[];
}