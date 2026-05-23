package rs.ac.novisad.singidunum.rp1backend.services;

import org.springframework.stereotype.Service;

import rs.ac.novisad.singidunum.rp1backend.models.Item;
import rs.ac.novisad.singidunum.rp1backend.repositories.ItemRepository;

@Service
public class ItemService extends BaseService<Item> {

	public ItemService(ItemRepository repo) {
		super(repo);
	}

}
