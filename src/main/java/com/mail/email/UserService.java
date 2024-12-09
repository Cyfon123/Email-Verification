package com.mail.email;

import org.springframework.http.ResponseEntity;

public interface UserService {
	
	ResponseEntity<?> saveUser(User user);

    ResponseEntity<?> confirmEmail(String confirmationToken);

}
