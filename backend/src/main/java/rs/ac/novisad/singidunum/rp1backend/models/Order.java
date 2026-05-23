package rs.ac.novisad.singidunum.rp1backend.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

	@Column(nullable = false, length = 100)
	private String customerName;
	
	@Column(nullable = true, length = 50)
	private String status;
	
	@Column(nullable = true)
	private LocalDateTime createdAt;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems = new ArrayList<OrderItem>();

	public Order() {
		super();
	}

	public Order(Long id) {
		super(id);
	}

	public Order(String customerName, String status, LocalDateTime createdAt) {
		super();
		this.customerName = customerName;
		this.status = status;
		this.createdAt = createdAt;
	}

	public Order(String customerName, String status, LocalDateTime createdAt, List<OrderItem> orderItems) {
		super();
		this.customerName = customerName;
		this.status = status;
		this.createdAt = createdAt;
		this.orderItems = orderItems;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
}
