package com.exam.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.DTO.ProductResponse;
import com.exam.model.Product;
import com.exam.repo.ProductRepository;
import com.exam.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductResponse listProduct(Product product) {
		Product savedProduct = productRepository.save(product);

		return ProductResponse.builder().id(savedProduct.getId()).description(savedProduct.getDescription())
				.listed(true).build();

	}

	@Override
	public List<ProductResponse> getListedProducts() {
		List<Product> listedProducts = productRepository.findAll();
		List<ProductResponse> allProducts = listedProducts.stream().map(listed -> ProductResponse.builder()
				.id(listed.getId()).description(listed.getDescription()).listed(true).build())
				.collect(Collectors.toList());
		return allProducts;
	}

}
