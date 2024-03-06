package com.LBG.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

//	private boolean inCart = true;

	@JsonManagedReference
	@OneToMany(mappedBy = "cart")
	private List<Item> item;

//
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the item
	 */
	public List<Item> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<Item> item) {
		this.item = item;
	}

	

	/**
	 * @return the inCart
	 */
//	public boolean isInCart() {
//		return inCart;
//	}
//
//	/**
//	 * @param inCart the inCart to set
//	 */
//	public void setInCart(boolean inCart) {
//		this.inCart = inCart;
//	}

}
