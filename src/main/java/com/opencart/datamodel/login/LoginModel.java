package com.opencart.datamodel.login;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class LoginModel {

    private String email;
    private String password;

}
