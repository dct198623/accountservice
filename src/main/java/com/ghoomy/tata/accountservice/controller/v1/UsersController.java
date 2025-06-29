package com.ghoomy.tata.accountservice.controller.v1;

import com.ghoomy.tata.accountservice.dto.request.ForgotPasswordRequestDTO;
import com.ghoomy.tata.accountservice.dto.request.LoginRequestDTO;
import com.ghoomy.tata.accountservice.dto.request.ResetPasswordRequestDTO;
import com.ghoomy.tata.accountservice.dto.request.SignupRequestDTO;
import com.ghoomy.tata.accountservice.dto.request.VerifyRequestDTO;
import com.ghoomy.tata.accountservice.dto.request.VerifyResetCodeRequestDTO;
import com.ghoomy.tata.accountservice.dto.response.ForgotPasswordResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.InformationResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.LoginResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.ResetPasswordResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.SignupResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.VerifyResetCodeResponseDTO;
import com.ghoomy.tata.accountservice.dto.response.VerifyResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/user")
public class UsersController {

    @Operation(summary = "User login", responses = {
            @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = LoginResponseDTO.class))),
    })
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO request) {

        LoginResponseDTO responseData = new LoginResponseDTO(1, "王大東");
        return ResponseEntity.ok(responseData);

    }

    @Operation(summary = "註冊", responses = {
            @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = SignupResponseDTO.class))),
    }, security = @SecurityRequirement(name = "Authorization"))
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequestDTO request) {

        SignupResponseDTO responseData = new SignupResponseDTO("example@gmail.com");
        return ResponseEntity.ok(responseData);

    }

    @Operation(summary = "忘記密碼", responses = {
            @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = ForgotPasswordResponseDTO.class))),
    }, security = @SecurityRequirement(name = "Authorization"))
    @PostMapping("/forgotPassword")
    public ResponseEntity<?> forgotPassword(@RequestBody ForgotPasswordRequestDTO request) {

        ForgotPasswordResponseDTO responseData = new ForgotPasswordResponseDTO("Verification code sent.");
        return ResponseEntity.ok(responseData);

    }

    @PostMapping("/verifyResetCode")
    public VerifyResetCodeResponseDTO verifyResetCode(@RequestBody VerifyResetCodeRequestDTO request) {
        System.out.println(request.getAccount());
        System.out.println(request.getCode());
        return new VerifyResetCodeResponseDTO("Verification successful.");
    }

    @Operation(summary = "驗證帳號", responses = {
            @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = VerifyResponseDTO.class)))
    }, security = @SecurityRequirement(name = "Authorization"))
    @PostMapping("/verify")
    public ResponseEntity<?> verify(@RequestBody VerifyRequestDTO request) {
        VerifyResponseDTO responseData = new VerifyResponseDTO("example@gmail.com");
        return ResponseEntity.ok(responseData);
    }

    @Operation(summary = "設定帳號資訊", responses = {
            @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = InformationResponseDTO.class)))
    }, security = @SecurityRequirement(name = "Authorization")
    )
    @PutMapping("/information")
    public ResponseEntity<?> information(
            @Parameter(description = "User ID", required = true)
            @RequestParam int userId
    ) {
        InformationResponseDTO InformationResponseData = new InformationResponseDTO("王大東", "0987654321", "1995-08-20", "4f9d4a8e-8b2f-11ee-b9d1-0242ac120002");
        return ResponseEntity.ok(InformationResponseData);
    }

    @Operation(summary = "重設密碼", responses = {
            @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = ResetPasswordResponseDTO.class)))
    }, security = @SecurityRequirement(name = "Authorization"))
    @PostMapping("/resetPassword")
    public ResponseEntity<?> resetPassword(@RequestBody ResetPasswordRequestDTO request) {
        ResetPasswordResponseDTO ResetPasswordResponseData = new ResetPasswordResponseDTO("Reset successfully.");
        return ResponseEntity.ok(ResetPasswordResponseData);
    }

}