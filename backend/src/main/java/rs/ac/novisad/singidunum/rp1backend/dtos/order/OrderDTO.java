package rs.ac.novisad.singidunum.rp1backend.dtos.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import rs.ac.novisad.singidunum.rp1backend.dtos.BaseDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.orderItem.OrderItemDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.models.Order;

public class OrderDTO extends BaseDTO<Order> {

	private Long id;
	private String customerName;
	private String status;
	private LocalDateTime createdAt;
	private List<OrderItemDTOLeaf> orderItems = new ArrayList<OrderItemDTOLeaf>();
	
	public OrderDTO() {
		super();
	}

	public OrderDTO(Long id, String customerName, String status, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.status = status;
		this.createdAt = createdAt;
	}

	public OrderDTO(Long id, String customerName, String status, LocalDateTime createdAt,
			List<OrderItemDTOLeaf> orderItems) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.status = status;
		this.createdAt = createdAt;
		this.orderItems = orderItems;
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

	public List<OrderItemDTOLeaf> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemDTOLeaf> orderItems) {
		this.orderItems = orderItems;
	}
	
}
