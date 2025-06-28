package com.ghoomy.tata.accountservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformationRequestDTO {
    private String name;
    private String phone;
    private String number;
    private String password;
    private String image;
}
