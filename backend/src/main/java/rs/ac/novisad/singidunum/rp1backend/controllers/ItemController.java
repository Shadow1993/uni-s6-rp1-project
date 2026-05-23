package rs.ac.novisad.singidunum.rp1backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.novisad.singidunum.rp1backend.dtos.item.ItemDTO;
import rs.ac.novisad.singidunum.rp1backend.dtos.item.ItemDTOLeaf;
import rs.ac.novisad.singidunum.rp1backend.mappers.ItemMapper;
import rs.ac.novisad.singidunum.rp1backend.models.Item;
import rs.ac.novisad.singidunum.rp1backend.services.ItemService;

@RestController
@RequestMapping(value = { "/api/items" })
public class ItemController extends BaseController<Item, ItemDTO, ItemDTOLeaf, ItemMapper> {

	public ItemController(ItemService service, ItemMapper mapper) {
		super(service, mapper);
	}

}
