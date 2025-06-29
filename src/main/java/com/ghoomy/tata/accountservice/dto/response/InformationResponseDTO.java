package com.ghoomy.tata.accountservice.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "設定帳號資訊")
public class InformationResponseDTO {

    @Schema(description = "姓名", example = "王大東")
    private String name;

    @Schema(description = "電話", example = "0912345678")
    private String phone;

    @Schema(description = "生日", example = "1997-01-01")
    private String birthday;

    @Schema(description = "圖片 id", example = "1")
    private String image;

}
