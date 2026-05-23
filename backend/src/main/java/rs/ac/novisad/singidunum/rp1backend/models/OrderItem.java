package rs.ac.novisad.singidunum.rp1backend.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem extends BaseEntity {
	
	@Column(nullable = false)
	private Integer quantity;
	
	@ManyToOne(optional = false)
	private Item item;
	
	@ManyToOne(optional = false, cascade = CascadeType.REMOVE)
	private Order order;

	public OrderItem() {
		super();
	}

	public OrderItem(Long id) {
		super(id);
	}

	public OrderItem(Integer quantity, Item item, Order order) {
		super();
		this.quantity = quantity;
		this.item = item;
		this.order = order;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
