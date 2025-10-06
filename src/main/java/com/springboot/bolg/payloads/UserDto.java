package com.springboot.bolg.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	
	private int id;
	@NotEmpty
	@Size(min = 5 , message = "Username must be minimum for 4 characters")
	private String name;
	@Email
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Email must be in correct format")
	private String email;
	@NotEmpty
	@Size(min = 5, max = 10, message = "Password must be min 5 char and max 10 chars !!")
	private String password;
	@NotEmpty
	private String about;
}
