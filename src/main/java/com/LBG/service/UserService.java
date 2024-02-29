package com.LBG.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.LBG.domain.User;
import com.LBG.repo.UserRepo;

public class UserService {

	private UserRepo repo;

	public UserService(UserRepo repo) {
		super();
		this.repo = repo;
	}

	public ResponseEntity<User> createUser(User newUser) {
		User created = this.repo.save(newUser);
		return new ResponseEntity<User>(created, HttpStatus.CREATED);

	}

	public List<User> getUser() {
		return this.repo.findAll();
	}

	public ResponseEntity<User> getUserById(int id) {
		Optional<User> found = this.repo.findById(id);

		if (found.isEmpty()) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		// attempts to pull the contents out of the box
		User body = found.get();

		return ResponseEntity.ok(body);

	}

//	public ResponseEntity<User> updateUser(int id, User newUser) {
//		Optional<User> found = this.repo.findById(id);
//
//		if (found.isEmpty()) {
//			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//		}
//
//		User existing = found.get();
//
//		if (newUser.getName() != null) {
//			existing.setName(newUser.getName());
//		}
//
//		if (newUser.getPrice() != null) {
//			existing.setPrice(newUser.getPrice());
//		}
//
//		if (newUser.getQuantity() != null)
//			existing.setQuantity(newUser.getQuantity());
//
//		User updated = this.repo.save(existing);
//
//		return ResponseEntity.ok(updated);

	public boolean deleteUser(int id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);

	}

}
