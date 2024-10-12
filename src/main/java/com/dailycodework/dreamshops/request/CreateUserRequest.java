package com.dailycodework.dreamshops.request;

import java.util.List;

import com.dailycodework.dreamshops.model.Role;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Boolean isAdmin;
}
