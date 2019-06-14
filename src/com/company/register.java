package com.company;

public class register {

    String firstname;
    String lastname;
    int id;
    String dateofbirth;
    int nationalid;

    public register() {
    }

    public String getFirstname() {
        return firstname;
    }

    public String setFirstname(String firstname) {
        this.firstname = firstname;
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String setLastname(String lastname) {
        this.lastname = lastname;
        return lastname;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
        return dateofbirth;
    }

    public int getNationalid() {
        return nationalid;
    }

    public int setNationalid(int nationalid) {
        this.nationalid = nationalid;
        return nationalid;
    }
}
