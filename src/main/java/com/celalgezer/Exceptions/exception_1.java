package com.celalgezer.Exceptions;



public class exception_1 extends RuntimeException{
    String defaultData="default data";
    public  String publicDefaultData="default data";
    public exception_1(String message) {
        super(message);
        System.out.println(defaultData);
    }
}
