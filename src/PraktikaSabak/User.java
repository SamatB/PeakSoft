package PraktikaSabak;

import java.util.Scanner;

public class User {
    private String name;
    private int birthYear;
    private long phonenum;

    void setName(String name) {
        this.name = name;
    }
    String getName () {
        return name;
    }
    void setBirthYear (int year) {
        this.birthYear =  2022 - year;
    }
    int getBirthYear () {
        return birthYear;
    }
    void setPhonenum (long number) {
        this.phonenum = number;
    }
    long getPhonenum () {
        return phonenum;
    }

}
