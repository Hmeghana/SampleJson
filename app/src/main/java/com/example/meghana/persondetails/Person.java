package com.example.meghana.persondetails;

public class Person {
    private String name;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    private String email;

    public Person(String name, String email, int home, int mobile) {
        this.name = name;
        this.email = email;
        this.home = home;
        this.mobile = mobile;
    }

    private int home;
    private int mobile;
}
