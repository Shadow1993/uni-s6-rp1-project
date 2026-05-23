package rs.ac.novisad.singidunum.rp1backend.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import rs.ac.novisad.singidunum.rp1backend.dtos.order.OrderDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.order.OrderDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.models.Order;

@Component
@Mapper(componentModel = "spring", uses = { OrderItemMapper.class })
public abstract class OrderMapper extends BaseMapper<Order, OrderDTO, OrderDTOLeaf> {

}
