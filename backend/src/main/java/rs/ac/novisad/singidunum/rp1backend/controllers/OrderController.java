package rs.ac.novisad.singidunum.rp1backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.novisad.singidunum.rp1backend.dtos.order.OrderDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.order.OrderDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.mappers.OrderMapper;
import rs.ac.novisad.singidunum.rp1backend.models.Order;
import rs.ac.novisad.singidunum.rp1backend.services.OrderService;

@RestController
@RequestMapping(value = { "/api/orders" })
public class OrderController extends BaseController<Order, OrderDTO, OrderDTOLeaf, OrderMapper> {

	public OrderController(OrderService service, OrderMapper mapper) {
		super(service, mapper);
	}

}
