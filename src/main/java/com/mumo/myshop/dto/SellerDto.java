package com.mumo.myshop.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SellerDto {
    private Long id;
    private String companyName;
    private Boolean approved;
    private String firstName;
    private String lastName;
    private String email;

}