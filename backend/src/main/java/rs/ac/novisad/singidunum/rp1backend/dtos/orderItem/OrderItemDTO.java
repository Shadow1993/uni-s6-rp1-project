package rs.ac.novisad.singidunum.rp1backend.dtos.orderItem;

import rs.ac.novisad.singidunum.rp1backend.dtos.BaseDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.item.ItemDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.dtos.order.OrderDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.models.OrderItem;

public class OrderItemDTO extends BaseDTO<OrderItem> {

	private Long id;
	private Integer quantity;
	private ItemDTOLeaf item;
	private OrderDTOLeaf order;
	
	public OrderItemDTO() {
		super();
	}

	public OrderItemDTO(Long id, Integer quantity, ItemDTOLeaf item, OrderDTOLeaf order) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.item = item;
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public ItemDTOLeaf getItem() {
		return item;
	}

	public void setItem(ItemDTOLeaf item) {
		this.item = item;
	}

	public OrderDTOLeaf getOrder() {
		return order;
	}

	public void setOrder(OrderDTOLeaf order) {
		this.order = order;
	}
	
}
