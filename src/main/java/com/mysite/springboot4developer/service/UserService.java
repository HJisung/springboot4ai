package com.mysite.springboot4developer.service;

import com.mysite.springboot4developer.domain.User;
import com.mysite.springboot4developer.dto.AddUserRequest;
import com.mysite.springboot4developer.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Long save(AddUserRequest dto){
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
