package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person me = new Person("Paul", "Matthews", 32);
        System.out.println(me);
        System.out.println(me.getFullName());
        System.out.println(me.getInitials());
        // example of protected data no one can use the properties even though they exist!
//        System.out.println(me.firstName); // we don't have access to the private firstName prop
//        System.out.println(me.lastName); // we don't have access to the private lastName prop
//        System.out.println(me.age); // we don't have access to the private age prop

        // example getter usage
//        System.out.println(me.getFirstName());
//        System.out.println(me.getLastName());
//        System.out.println(me.getAge());
    }
}
