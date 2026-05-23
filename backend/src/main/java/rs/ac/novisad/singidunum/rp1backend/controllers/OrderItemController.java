package rs.ac.novisad.singidunum.rp1backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.novisad.singidunum.rp1backend.dtos.orderItem.OrderItemDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.orderItem.OrderItemDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.mappers.OrderItemMapper;
import rs.ac.novisad.singidunum.rp1backend.models.OrderItem;
import rs.ac.novisad.singidunum.rp1backend.services.OrderItemService;

@RestController
@RequestMapping(value = { "/api/orderitems" })
public class OrderItemController extends BaseController<OrderItem, OrderItemDTO, OrderItemDTOLeaf, OrderItemMapper> {

	public OrderItemController(OrderItemService service, OrderItemMapper mapper) {
		super(service, mapper);
	}

}
