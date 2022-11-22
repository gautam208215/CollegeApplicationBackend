package com.exam.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserData {

	@NotEmpty(message = "user id cannot be empty")
	@NotNull(message = "user id cannot be null")
	private Long id;

	@NotEmpty(message = "username cannot be empty")
	@NotNull(message = "username cannot be empty")
	private String username;

}
