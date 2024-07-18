package com.example.crawlov2.Controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    public class PasswordHashingUtil {
        public static void main(String[] args) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String rawPassword = "admin123";
            String encodedPassword = encoder.encode(rawPassword);
            System.out.println(encodedPassword);
        }
    }
}


