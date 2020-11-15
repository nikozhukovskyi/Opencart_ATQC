package com.opencart.repository.login;

import com.opencart.datamodel.login.LoginModel;

public class LoginModelRepository {

    private LoginModelRepository(){
    }

    public static LoginModel getLoginModel() {
        return LoginModel.builder()
                .email("qwe@gmail.com")
                .password("buybeka123")
                .build();
    }
}
