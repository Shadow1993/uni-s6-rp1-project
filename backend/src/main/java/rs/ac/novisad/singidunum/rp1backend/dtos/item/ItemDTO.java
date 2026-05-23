package rs.ac.novisad.singidunum.rp1backend.dtos.item;

import java.util.ArrayList;
import java.util.List;

import rs.ac.novisad.singidunum.rp1backend.dtos.BaseDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.orderItem.OrderItemDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.models.Item;

public class ItemDTO extends BaseDTO<Item> {

	private Long id;
	private String name;
	private Double price;
	private List<OrderItemDTOLeaf> orderItems = new ArrayList<OrderItemDTOLeaf>();
	
	public ItemDTO() {
		super();
	}

	public ItemDTO(Long id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public ItemDTO(Long id, String name, Double price, List<OrderItemDTOLeaf> orderItems) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.orderItems = orderItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<OrderItemDTOLeaf> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemDTOLeaf> orderItems) {
		this.orderItems = orderItems;
	}
	
}
