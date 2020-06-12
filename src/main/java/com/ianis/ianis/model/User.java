package com.ianis.ianis.model;

public class User {
    private final String id;
    private final String login;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String phoneNb;

    public User(String id, String firstname, String lastname, String email, String phoneNB, String login, String password)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNb = phoneNB;
        this.login = login;
        this.password = password;
    }

    public String getId()
    {
        return id;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhoneNb()
    {
        return phoneNb;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

