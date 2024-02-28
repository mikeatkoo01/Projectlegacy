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

import com.LBG.domain.Cart;
import com.LBG.service.CartService;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartController {

	private CartService service;

	public CartController(CartService service) {
		super();
		this.service = service;
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/create")
	public ResponseEntity<Cart> createCart(@RequestBody Cart newCart) {

		return this.service.createCart(newCart);
	}

	// read all
	@GetMapping("/read")

	public List<Cart> getCart() {
		return this.service.getCart();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable int id) {
		return this.service.getCartById(id);
	}

//	@PutMapping("update/{id}")
//	public ResponseEntity<Cart> updateCart(@PathVariable int id, Cart newCart){
//		return this.service.updateCart(id, newCart);
//	}
//	

	@DeleteMapping("delete/{id}")
	public boolean deleteCartItem(@PathVariable int id) {
		return this.service.deleteCartItem(id);
	}

}
