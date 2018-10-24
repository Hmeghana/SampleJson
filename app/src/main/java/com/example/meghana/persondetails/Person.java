package com.example.meghana.persondetails;

public class Person {
    private String name;
    private String home;
    private String mobile;
    private String email;
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

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    public Person(String name, String email, String home, String mobile) {
        this.name = name;
        this.email = email;
        this.home = home;
        this.mobile = mobile;
    }


}
