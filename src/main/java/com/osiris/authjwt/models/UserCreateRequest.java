package com.osiris.authjwt.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
