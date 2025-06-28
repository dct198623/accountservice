package com.ghoomy.tata.accountservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformationResponseDTO {
    private String name;
    private String phone;
    private String number;
    private String passwordHash;
    private String image;
}
