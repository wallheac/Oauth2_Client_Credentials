package com.wafflehammer.OAuth2Mock;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableResourceServer
@RestController
public class ResourceController {
    @RequestMapping("/test")
    public String congratulations() {
        return "WINNING! You have successfully authenticated";
    }
}