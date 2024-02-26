package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	private CartService service;

	public CartController(CartService service) {
		super();
		this.service = service;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
@PostMapping("/create")
	
	
	//read all
	@GetMapping("/read")
	
	
	@GetMapping("/get/{id}")
	
	
	@PutMapping("update/{id}")
	
	
	@DeleteMapping("delete/{id}")
}
