package com.dimco.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@Slf4j
public class AuthorizationController {

    @GetMapping("/login")
    public Principal login(Principal principal) {
        log.info("Principal started");
        return principal;
    }
}
