package com.personal.projects.lovableClone.DTO;


import lombok.Data;
import lombok.experimental.FieldDefaults;
import jakarta.validation.constraints.NotBlank;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class UserDTO {

    @NotBlank
    String name;

    @NotBlank
    String email;

    @NotBlank
    String password;
}
