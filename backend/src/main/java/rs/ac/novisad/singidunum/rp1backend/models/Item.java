package rs.ac.novisad.singidunum.rp1backend.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item extends BaseEntity {

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Double price;
	
	@OneToMany(mappedBy = "item")
	private List<OrderItem> orderItems = new ArrayList<OrderItem>();

	public Item() {
		super();
	}

	public Item(Long id) {
		super(id);
	}

	public Item(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Item(String name, Double price, List<OrderItem> orderItems) {
		super();
		this.name = name;
		this.price = price;
		this.orderItems = orderItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
}
