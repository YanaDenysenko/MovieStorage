package org.example;

import org.example.service.impl.UserServiceImpl;

public class Main {
    public static UserServiceImpl userService = new UserServiceImpl();

    public static void main(String[] args) {
        //userService.getById();
        System.out.println("Hello world!");
    }
}