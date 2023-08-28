package com.builder;

public class UserWebDTO implements UserDTO{
    private String name;
    private String password;
    private int sessionTimeMinuetes;
    private String role;

    public UserWebDTO(String name, String password, int sessionTimeMinuetes, String role) {
        this.name = name;
        this.password = password;
        this.sessionTimeMinuetes = sessionTimeMinuetes;
        this.role = role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int getSessionTimeMinuets() {
        return sessionTimeMinuetes;
    }

    @Override
    public String getRole() {
        return role;
    }
}
