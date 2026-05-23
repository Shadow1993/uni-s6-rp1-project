package rs.ac.novisad.singidunum.rp1backend.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import rs.ac.novisad.singidunum.rp1backend.dtos.orderItem.OrderItemDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.orderItem.OrderItemDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.models.OrderItem;

@Component
@Mapper(componentModel = "spring")
public abstract class OrderItemMapper extends BaseMapper<OrderItem, OrderItemDTO, OrderItemDTOLeaf> {

}
