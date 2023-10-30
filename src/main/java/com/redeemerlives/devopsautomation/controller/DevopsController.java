package com.redeemerlives.devopsautomation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/devops-automation/")
public class DevopsController {
    @GetMapping
    public String gettingStarted() {
        return "Getting started with devops automation";
    }
}
