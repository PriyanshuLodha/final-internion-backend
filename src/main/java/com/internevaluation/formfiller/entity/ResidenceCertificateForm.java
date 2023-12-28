package com.internevaluation.formfiller.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceCertificateForm {
    private String name;
    private String parent_name;
    private String village;
    private  String taluka;
    private String district;
    private String place_of_register;
    private String date_of_register;
    private String document_for_verify;
    private String email;
}
