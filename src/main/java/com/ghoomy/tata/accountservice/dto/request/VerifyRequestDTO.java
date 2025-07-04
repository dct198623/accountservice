package com.ghoomy.tata.accountservice.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "驗證帳號")
public class VerifyRequestDTO {

    @Schema(description = "帳號", example = "example@gmail.com")
    private String account;

    @Schema(description = "驗證碼", example = "123456")
    private String verifyCode;

}
