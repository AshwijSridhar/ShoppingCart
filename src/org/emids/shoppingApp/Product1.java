package org.emids.shoppingApp;

import java.util.Objects;

class Product1 extends Inventory {
	private Integer pid;
	private String name;
	private Double price;
	private Integer stock;

	public InventorySearch()

	public Product1() {
	}

	public void Product(Integer pid, String name, Double price, Integer stock) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            the stock to set
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getPid() {
		return pid;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.pid);
		hash = 29 * hash + Objects.hashCode(this.name);
		hash = 29 * hash + Objects.hashCode(this.price);
		hash = 29 * hash + Objects.hashCode(this.stock);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Product1 other = (Product1) obj;
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (!Objects.equals(this.pid, other.pid)) {
			return false;
		}
		if (!Objects.equals(this.price, other.price)) {
			return false;
		}
		if (!Objects.equals(this.stock, other.stock)) {
			return false;
		}
		return true;
	}

	public void setPid(Integer pid) {
        this.pid = pid;
}
