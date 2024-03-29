package com.LBG.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LBG.domain.User;
import com.LBG.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	private UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}

//	public UserController() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User newUser) {

		return this.service.createUser(newUser);
	}

	@GetMapping("/read")
	public List<User> getUser() {
		return this.service.getUser();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id) {
		return this.service.getUserById(id);

	}

//	@PutMapping("update/{id}")
//	public ResponseEntity<Item> updateUser(@PathVariable int id, Item newItem) {
//		return this.service.updateUser(id, newItem);
//	}

	@DeleteMapping("delete/{id}")
	public boolean deleteUser(@PathVariable int id) {
		return this.service.deleteUser(id);

	}

}
