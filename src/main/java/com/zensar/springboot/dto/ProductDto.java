package com.zensar.springboot.dto;

import javax.persistence.Transient;

public class ProductDto {
	private int productId;
	private String productName;
	private int productPrice;
	@Transient
	private String couponCode;

	public ProductDto() {
		super();
	}

	public ProductDto(int productId, String productName, int productPrice, String couponCode) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.couponCode = couponCode;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", couponCode=" + couponCode + "]";
	}

}
