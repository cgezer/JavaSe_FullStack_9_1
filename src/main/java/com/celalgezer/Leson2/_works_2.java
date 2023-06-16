package com.celalgezer.Leson2;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _works_2 {
    public void loop_works(){
        System.out.println("deneme");

        Scanner sc=new Scanner(System.in);
        System.out.println("adınız ve soyadınızı girebilirsiniz");
        String fullName=sc.nextLine();
        String userName=fullName.substring(0,fullName.indexOf(" "));
        String surName=fullName.substring(fullName.indexOf(" "),fullName.length());
        String upper_surName=userName.substring(0).toUpperCase();
        userName=userName.replace(userName.charAt(0),upper_surName.charAt(0));
        for (int i=1;i<userName.length()-1;i++){
            userName=userName.replace(userName.charAt(i),'*');
        }
        Date date= new Date();
        System.out.println("yıl: "+(date.getYear()+1900));
        System.out.println(userName);
    }
}
