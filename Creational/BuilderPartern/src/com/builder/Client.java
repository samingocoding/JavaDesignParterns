package com.builder;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }
    private static UserDTO directBuild(UserDTOBuilder builder, User user){
     return builder.withName(user.getName()).withPassword(user.getPassword())
             .withSessionMinuets(user.getSessionTimeMinuets())
             .withRole(user.getRole()).build();
    }
    public static User createUser(){
        User user = new User();
        user.setName("Samuel Mahembe");
        user.setPassword("password");
        user.setSessionTimeMinuets(9);
        Role role = new Role();
        role.setRoleName("Admin");
        role.setRoleId(4);
        user.setRole(role);
        return user;
    }
}
