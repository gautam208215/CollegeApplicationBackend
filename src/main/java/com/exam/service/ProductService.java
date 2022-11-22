package com.exam.service;

import java.util.List;

import com.exam.DTO.ProductResponse;
import com.exam.model.Product;

public interface ProductService {

	public ProductResponse listProduct(Product product);

	public List<ProductResponse> getListedProducts();
}
