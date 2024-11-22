package com.gass.dto;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class LoginDTO {
    private String id;
    private String name;
    private String email;
    private String contact;
    private String password;

}
