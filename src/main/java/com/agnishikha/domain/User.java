package com.agnishikha.domain;

public class User {

    private String name;
    private String userName;
    private String status;
    private String phone_number;
    private String email;



    public User(String name, String userName, String status, String phone_number, String email) {
        this.name = name;
        this.userName = userName;
        this.status = status;
        this.phone_number = phone_number;
        email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", status='" + status + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
