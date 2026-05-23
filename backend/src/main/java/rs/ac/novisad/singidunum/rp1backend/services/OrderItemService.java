package rs.ac.novisad.singidunum.rp1backend.services;

import org.springframework.stereotype.Service;

import rs.ac.novisad.singidunum.rp1backend.models.OrderItem;
import rs.ac.novisad.singidunum.rp1backend.repositories.OrderItemRepository;

@Service
public class OrderItemService extends BaseService<OrderItem> {

	public OrderItemService(OrderItemRepository repo) {
		super(repo);
	}

}
