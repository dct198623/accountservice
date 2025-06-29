package com.ghoomy.tata.accountservice.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "重設密碼")
public class ResetPasswordResponseDTO {

    @Schema(description = "重設密碼結果", example = "Reset successfully.")
    private String message;

}
