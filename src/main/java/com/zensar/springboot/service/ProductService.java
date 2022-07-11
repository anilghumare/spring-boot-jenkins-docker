package com.zensar.springboot.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.zensar.springboot.dto.ProductDto;
import com.zensar.springboot.entity.Product;

public interface ProductService {

	public ProductDto getProduct(int productId);

	public List<ProductDto> getAllProducts(int pageNumber, int pageSize, String sortBy, Direction dir);

	public ProductDto insertProduct(ProductDto product);

	public void updateProduct(int productId, ProductDto productDto);

	public void deleteProduct(int productId);

	List<ProductDto> getByProductName(String productName);

	List<ProductDto> getByProductNameAndProductPrice(String productName, int productPrice);

}
