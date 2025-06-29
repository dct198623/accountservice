package com.ghoomy.tata.accountservice.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "設定帳號資訊")
public class InformationRequestDTO {

    @Schema(description = "姓名", example = "王小明")
    private String name;

    @Schema(description = "電話", example = "0912345678")
    private String phone;

    @Schema(description = "生日", example = "1997-01-01")
    private String birthday;

    @Schema(description = "密碼", example = "password")
    private String password;

    @Schema(description = "圖片 id", example = "4f9d4a8e-8b2f-11ee-b9d1-0242ac120002")
    private String image;

}
