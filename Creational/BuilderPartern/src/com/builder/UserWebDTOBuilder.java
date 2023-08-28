package com.builder;

public class UserWebDTOBuilder implements UserDTOBuilder{
    private String uname;
    private  String urole;
    private String upassword;
    private int usessionTimeMinuets;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withName(String name) {
        uname=name;
        return this;
    }

    @Override
    public UserDTOBuilder withPassword(String password) {
       upassword=password;
        return this;
    }

    @Override
    public UserDTOBuilder withRole(Role role) {
        urole=role.toString();
        return this;
    }

    @Override
    public UserDTOBuilder withSessionMinuets(int sessionMinuets) {
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(uname,upassword,usessionTimeMinuets,urole);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
