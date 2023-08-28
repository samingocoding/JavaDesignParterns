package com.builder;

public interface UserDTOBuilder {
    UserDTOBuilder withName(String name);
    UserDTOBuilder withPassword(String password);
    UserDTOBuilder withRole(Role role);
    UserDTOBuilder withSessionMinuets(int sessionMinuets);
    UserDTO build();
    UserDTO getUserDTO();
}
