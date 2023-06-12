package com.celalgezer;
import java.sql.SQLOutput;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
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
        }
    }
}