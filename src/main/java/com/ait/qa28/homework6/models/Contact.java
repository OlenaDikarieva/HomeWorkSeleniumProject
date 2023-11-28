package com.ait.qa28.homework6.models;

public class Contact {
    private  String FirstName;
    private  String LastName;
    private String email;
    private String password;

    public Contact FirstName(String firstName) {
        this.FirstName = firstName;
        return this;
    }

    public Contact LastName(String lastName) {
        this.LastName = lastName;
        return this;
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }

    public Contact setPassword(String password) {
        this.password = password;
        return this;
    }


    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
