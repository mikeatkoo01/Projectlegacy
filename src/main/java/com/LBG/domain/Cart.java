package com.LBG.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	private boolean inCart = true;

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
	 * @return the inCart
	 */
	public boolean isInCart() {
		return inCart;
	}

	/**
	 * @param inCart the inCart to set
	 */
	public void setInCart(boolean inCart) {
		this.inCart = inCart;
	}

}
