package com.builder;

public class User {
    private String name;
    private  Role role;
    private String password;
    private int sessionTimeMinuets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSessionTimeMinuets() {
        return sessionTimeMinuets;
    }

    public void setSessionTimeMinuets(int sessionTimeMinuets) {
        this.sessionTimeMinuets = sessionTimeMinuets;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
