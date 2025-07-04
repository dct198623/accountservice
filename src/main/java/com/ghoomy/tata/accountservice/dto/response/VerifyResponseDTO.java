package com.ghoomy.tata.accountservice.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "驗證帳號")
public class VerifyResponseDTO {

    @Schema(description = "帳號", example = "example@gmail.com")
    private String account;

}