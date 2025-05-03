package com.ghoomy.tata.accountservice.controller.v1;

import com.ghoomy.tata.accountservice.dto.request.LoginRequestDTO;
import com.ghoomy.tata.accountservice.dto.response.LoginResponsetDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/auth")
public class UsersController {

    @GetMapping("/test")
    public String test(){
        System.out.println("Hi!");
        return "Hello World 123";
    }

    @PostMapping("/login")
    public LoginResponsetDTO login(@RequestBody LoginRequestDTO request) {
        System.out.println(request.getAccount());
        System.out.println(request.getPwdHash());
        return new LoginResponsetDTO(1, "eyJhbGciOiJIUzI1NiIsInR5cCI6Ikp", 3600);
    }

}