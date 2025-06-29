package com.ghoomy.tata.accountservice.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "重設密碼")
public class ResetPasswordRequestDTO {

    @Schema(description = "帳號", example = "example@gmail.com")
    private String account;

    @Schema(description = "驗證碼", example = "123456")
    private String code;

    @NotBlank(message = "新密碼不得為空")
    @Schema(description = "新密碼", example = "newPassword")
    private String newPassword;

}
