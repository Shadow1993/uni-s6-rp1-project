package rs.ac.novisad.singidunum.rp1backend.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import rs.ac.novisad.singidunum.rp1backend.dtos.item.ItemDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.item.ItemDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.models.Item;

@Component
@Mapper(componentModel = "spring", uses = { OrderItemMapper.class })
public abstract class ItemMapper extends BaseMapper<Item, ItemDTO, ItemDTOLeaf> {

}
