package com.celalgezer.Leson1;

import com.celalgezer.Exceptions.exception_1;
import com.celalgezer.Leson2._works_2;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class _Work_1 {
    String defaultData="default data";
    public  String publicDefaultData="default data";

    public static void main(String[] args) {

        /*
        Scanner scanner= new Scanner(System.in);
        System.out.println("bir şeyler yazabilirsiniz");
        char value =scanner.next().charAt(0);
        int _intvalue=value;
        System.out.println(_intvalue);
        if((_intvalue>=0&&_intvalue<=47)||(_intvalue>=58&&_intvalue<=64)||(_intvalue>=91&&_intvalue<=96)||(_intvalue>=123&&_intvalue<=127)){
            System.out.println("Girilen değer bir karakterdir");
        }
        else if ((_intvalue>=97&&_intvalue<=122)||(_intvalue>=65&&_intvalue<=90)) {
            System.out.println("girilen değer bir harftir");
        }
        else if((_intvalue>=48&&_intvalue<=57)||_intvalue>=128){
            System.out.println("girilen değer bir rakamdır");
        }
        else{
            System.out.println("girilen değer bir sayıdır");
        }*/

        long time_work=System.currentTimeMillis();
        System.out.println("Mili Saniye: "+time_work);
        String getDate= new Date(System.currentTimeMillis()).toString();
        System.out.println("Date: "+getDate.substring(0,11));
        try {
            int unLogical=0;
            System.out.println("result: "+10/0);
        }catch (ArithmeticException e){
           e.printStackTrace();
        }finally {
            System.out.println("finally kısmı çalıştı");
        }
        throw new exception_1("girilen takip numarası yanlıştır");

        //time_works example= new time_works();
        //example.time_works();
    }
}
