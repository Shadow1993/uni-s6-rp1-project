import { BaseModel } from "./base-model";
import { Item } from "./item";
import { Order } from "./order";

export interface OrderItem extends BaseModel {
    quantity: number;
    item: Item;
    order: Order;
}