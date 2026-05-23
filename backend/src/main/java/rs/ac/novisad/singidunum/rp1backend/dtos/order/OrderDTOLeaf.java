package rs.ac.novisad.singidunum.rp1backend.dtos.order;

import java.time.LocalDateTime;

import rs.ac.novisad.singidunum.rp1backend.dtos.BaseDTO;
import rs.ac.novisad.singidunum.rp1backend.models.Order;

public class OrderDTOLeaf extends BaseDTO<Order> {

	private Long id;
	private String customerName;
	private String status;
	private LocalDateTime createdAt;
	
	public OrderDTOLeaf() {
		super();
	}

	public OrderDTOLeaf(Long id, String customerName, String status, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.status = status;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
}
