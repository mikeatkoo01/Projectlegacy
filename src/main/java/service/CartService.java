package service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.LBG.domain.Cart;

import repo.CartRepo;

@Service
public class CartService {
	
	private CartRepo repo;


	public CartService(CartRepo repo) {
		super();
		this.repo = repo;
	}


	public ResponseEntity<Cart> createCart(Cart newCart) {
		Cart created = this.repo.save (newCart);
		return new ResponseEntity<Cart>(created, HttpStatus.CREATED);
	}


	public List<Cart> getCart() {
	
		return this.repo.findAll();
	}


	public ResponseEntity<Cart> getCartById(int id) {
	
		Optional<Cart> found = this.repo.findById(id);
		
		
		if (found.isEmpty()) {
			return new ResponseEntity<Cart>(HttpStatus.NOT_FOUND);
			
		}
		
		Cart body = found.get();
		return ResponseEntity.ok(body);
	}


	public boolean deleteCartItem(int id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}


//	public ResponseEntity<Cart> updateCart(int id, Cart newCart) {
//		Optional<Cart> found = this.repo.findById(id);
//		if (found.isEmpty()) {
//			return new ResponseEntity<Cart>(HttpStatus.NOT_FOUND);
//			
//		}
//		
//		Cart existing = found.get();
//		
//		if (newCart.g)
//		
//		return null;
//	}
//	
	
	

}
