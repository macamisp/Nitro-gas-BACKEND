package com.gass.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shop {
    private Integer id;
    private String name;
    private String email;
    private String address;
    private String phone;
    private String nic;
}