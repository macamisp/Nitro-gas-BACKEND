package com.gass.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Gass {
    private Integer id;
    private String name;
    private String email;
    private String address;
    private String phone;
    private String nic;
    private String weight;
    private String gasname;
    private String unit;
    private String price;


}
