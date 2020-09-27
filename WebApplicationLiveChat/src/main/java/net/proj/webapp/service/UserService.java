package net.proj.webapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.proj.webapp.model.User;
import net.proj.webapp.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
