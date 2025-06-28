package com.ghoomy.tata.accountservice.controller.v1;

import com.ghoomy.tata.accountservice.dto.request.ForgotPasswordRequestDTO;
import com.ghoomy.tata.accountservice.dto.request.LoginRequestDTO;
import com.ghoomy.tata.accountservice.dto.request.SignupRequestDTO;
import com.ghoomy.tata.accountservice.dto.response.ForgotPasswordResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.LoginResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.SignupResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/user")
public class UsersController {

    @GetMapping("/test")
    public String test() {
        System.out.println("Hi!");
        return "Hello World!!";
    }

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO request) {
        System.out.println(request.getAccount());
        System.out.println(request.getPwdHash());
        return new LoginResponseDTO(1, "eyJhbGciOiJIUzI1NiIsInR5cCI6Ikp", 3600);
    }

    @PostMapping("/signup")
    public SignupResponseDTO signup(@RequestBody SignupRequestDTO request) {
        System.out.println(request.getAccount());
        return new SignupResponseDTO("example@gmail.com");
    }

    @PostMapping("/forgotPassword")
    public ForgotPasswordResponseDTO signup(@RequestBody ForgotPasswordRequestDTO request) {
        System.out.println(request.getAccount());
        return new ForgotPasswordResponseDTO("Verification code sent.", 3600);
    }

}