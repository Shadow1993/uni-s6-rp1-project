package rs.ac.novisad.singidunum.rp1backend.services;

import org.springframework.stereotype.Service;

import rs.ac.novisad.singidunum.rp1backend.models.Order;
import rs.ac.novisad.singidunum.rp1backend.repositories.OrderRepository;

@Service
public class OrderService extends BaseService<Order> {

	public OrderService(OrderRepository repo) {
		super(repo);
	}

}
