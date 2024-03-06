package com.LBG.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.LBG.domain.Item;
import com.LBG.repo.ItemRepo;

@Service
public class ItemService {

	private ItemRepo repo;

	public ItemService(ItemRepo repo) {
		super();
		this.repo = repo;
	}

	public ResponseEntity<Item> createItem(Item newItem) {
		Item created = this.repo.save(newItem);
		return new ResponseEntity<Item>(created, HttpStatus.CREATED);

	}

	public List<Item> getItem() {
		return this.repo.findAll();
	}

	public ResponseEntity<Item> getItemById(int id) {
		Optional<Item> found = this.repo.findById(id);

		if (found.isEmpty()) {
			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		}

		Item body = found.get();

		return ResponseEntity.ok(body);

	}

	public ResponseEntity<Item> updateItem(int id, Item newItem) {
		Optional<Item> found = this.repo.findById(id);

		if (found.isEmpty()) {
			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		}

		Item existing = found.get();

		if (newItem.getName() != null) {
			existing.setName(newItem.getName());
		}

		if (newItem.getPrice() != null) {
			existing.setPrice(newItem.getPrice());
		}

		if (newItem.getQuantity() != null)
			existing.setQuantity(newItem.getQuantity());
		
		if(newItem.getUploadImages()!=null)
			existing.setUploadImages(newItem.getUploadImages());

		Item updated = this.repo.save(existing);

		return ResponseEntity.ok(updated);

	}

	public boolean deleteItem(int id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);

	}

}
