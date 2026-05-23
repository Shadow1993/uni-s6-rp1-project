package rs.ac.novisad.singidunum.rp1backend.dtos.item;

import rs.ac.novisad.singidunum.rp1backend.dtos.BaseDTO;
import rs.ac.novisad.singidunum.rp1backend.models.Item;

public class ItemDTOLeaf extends BaseDTO<Item> {
	
	private Long id;
	private String name;
	private Double price;
	
	public ItemDTOLeaf() {
		super();
	}

	public ItemDTOLeaf(Long id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	
}
