package com.example.abo_v1;

public class Person {
    private String userName;
    private String password;
    private String email;
    private String address;
    private String profilePicPath;

    public Person() {
    }

    public Person(String userName, String password, String email, String address, String profilePicPath) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.profilePicPath = profilePicPath;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfilePicPath() {
        return profilePicPath;
    }

    public void setProfilePicPath(String profilePicPath) {
        this.profilePicPath = profilePicPath;
    }
    public void Login(){}
    public void logout(){}
    public void ManageProifle(){}
    public void sendMessage(){}
}
