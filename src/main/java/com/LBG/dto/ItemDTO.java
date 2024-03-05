package com.LBG.dto;

import com.LBG.domain.Item;

public class ItemDTO {

	private Integer id;

	private String itemName;

	private Double price;

	private Integer quantity;

	private Integer cartId;

	public ItemDTO(Item item) {
		super();
		this.setId(item.getId());
		this.setItemName(item.getName());
		this.setPrice(item.getPrice());
		this.setQuantity(item.getQuantity());

		if (item.getCart() != null) {
			this.setCartId(item.getCart().getId());
		}
	}

	public ItemDTO() {
		super();
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
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the cartId
	 */
	public Integer getCartId() {
		return cartId;
	}

	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
}
