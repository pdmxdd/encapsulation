package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getInitials() {
        return this.firstName.substring(0, 1) + "." + this.lastName.substring(0, 1) + ".";
    }

    // how would we access the private properties? -> with getters!
//    public String getFirstName() {
//        return this.firstName;
//    }
//
//    public String getLastName() {
//        return this.lastName;
//    }
//
//    public int getAge() {
//        return this.age;
//    }

    // how would we modify the private properties? -> with setters!
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void haveBirthday() {
//        this.age += 1;
//    }
}
