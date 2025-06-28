package com.ghoomy.tata.accountservice.controller.v1;

import com.ghoomy.tata.accountservice.dto.request.LoginRequestDTO;
import com.ghoomy.tata.accountservice.dto.request.VerifyRequestDTO;
import com.ghoomy.tata.accountservice.dto.response.InformationResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.LoginResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.VerifyResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/user")
public class UsersController {

    @GetMapping("/test")
    public String test() {
        System.out.println("Hi!");
        return "Hello World 123";
    }

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO request) {
        System.out.println(request.getAccount());
        System.out.println(request.getPwdHash());
        return new LoginResponseDTO(1, "eyJhbGciOiJIUzI1NiIsInR5cCI6Ikp", 3600);
    }

    @PostMapping("/verify")
    public VerifyResponseDTO verify(@RequestBody VerifyRequestDTO request) {
        System.out.println(request.getAccount());
        System.out.println(request.getVerifyCode());
        return new VerifyResponseDTO("example@gmail.com");
    }

    @PostMapping("/information")
    public InformationResponseDTO verify(@RequestParam int userId) {
        return new InformationResponseDTO("王大東", "0987654321", "1995-08-20", "$2b$12$3vR4IhMw2rI3TUN97bXQcO", "4f9d4a8e-8b2f-11ee-b9d1-0242ac120002");
    }

}