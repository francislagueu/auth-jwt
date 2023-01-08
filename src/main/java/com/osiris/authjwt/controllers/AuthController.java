package com.osiris.authjwt.controllers;

import com.osiris.authjwt.models.AuthRequest;
import com.osiris.authjwt.models.AuthResponse;
import com.osiris.authjwt.models.UserCreateRequest;
import com.osiris.authjwt.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody UserCreateRequest request){
        return ResponseEntity.ok(authService.registerUser(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request){
        return ResponseEntity.ok(authService.login(request));
    }
}
