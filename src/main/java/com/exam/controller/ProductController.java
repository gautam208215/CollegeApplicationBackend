package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.DTO.ProductRequest;
import com.exam.DTO.ProductResponse;
import com.exam.exception.CustomException;
import com.exam.model.Product;
import com.exam.model.User;
import com.exam.repo.UserRepository;
import com.exam.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ProductService productService;

	@PostMapping("buy")
	public ResponseEntity<ProductResponse> listProduct(@RequestBody ProductRequest productRequest) throws Exception {
		User userObtained = userRepository.findByIdAndUsername(productRequest.getUserData().getId(),
				productRequest.getUserData().getUsername());
		Product productToBeListed = null;
		if (userObtained != null) {
			productToBeListed = Product.builder().description(productRequest.getDescription()).user(userObtained)
					.build();
		} else {
			throw new CustomException("user not found", HttpStatus.BAD_REQUEST.toString());
		}
		ProductResponse listProduct = productService.listProduct(productToBeListed);
		return new ResponseEntity<ProductResponse>(listProduct, HttpStatus.CREATED);
	}

	@GetMapping("listed")
	public ResponseEntity<List<ProductResponse>> getAllProducts() {
		List<ProductResponse> listedProducts = productService.getListedProducts();
		return new ResponseEntity<List<ProductResponse>>(listedProducts, HttpStatus.OK);
	}

}
