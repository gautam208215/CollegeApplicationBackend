package com.exam.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequest {

	@Size(max = 40, message = "product description cannot be greater than 40 characters")
	@NotNull(message = "description cannot be null")
	@NotEmpty(message = "description cannot be empty")
	private String description;

	@NotEmpty
	@NotNull
	private UserData userData;

}
