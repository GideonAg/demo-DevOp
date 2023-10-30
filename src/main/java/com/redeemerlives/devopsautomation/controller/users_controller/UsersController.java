package com.redeemerlives.devopsautomation.controller.users_controller;

import com.redeemerlives.devopsautomation.service.users_service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users/")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<String> helloUser() {
        return ResponseEntity.ok(userService.helloUser());
    }
}
