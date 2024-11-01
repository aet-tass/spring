package com.deliveEpress.platform.dto;

import com.deliveEpress.platform.entity.Users;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class reqRes {
    private  int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String fullName;
    private String phoneNumber;
    private String homeAddress;
    private String workAddress;
    private String email;
    private String role;
    private String password;
    private Users users;
    private List<Users> usersList;
}
