package com.noctua.customer;

public record CustomerRegistrationRequest(
			String firstName,
			String lastName,
			String email) {

}
