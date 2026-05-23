package rs.ac.novisad.singidunum.rp1backend.dtos.orderItem;

import rs.ac.novisad.singidunum.rp1backend.dtos.BaseDTO;
import rs.ac.novisad.singidunum.rp1backend.models.OrderItem;

public class OrderItemDTOLeaf extends BaseDTO<OrderItem> {

	private Long id;
	private Integer quantity;
	
	public OrderItemDTOLeaf() {
		super();
	}

	public OrderItemDTOLeaf(Long id, Integer quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
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
	
}
