package com.celalgezer.Leson2;

import java.sql.Array;

public enum enumDeneme {
    OCAK,ŞUBAT,MART,NİSAN,MAYIS,TEMMUZ,AĞUSTOS,EYLUL,EKIM,KASIM,ARALIK
}
class DenemeEnum{
    public static void main(String[] args) {
        for (int i=0;i<enumDeneme.values().length;i++){
            try {
                System.out.println(enumDeneme.EKIM);
                System.out.println(enumDeneme.AĞUSTOS.ordinal());
                System.out.println(enumDeneme.AĞUSTOS.values()[3]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            int diziInt[]=new int[10];
           String diziString[]={"sdasdas","asdads","asasa"};
           Double diziDouble[]=new Double[10];
           Float diziFloat[]=new Float[10];
           diziFloat[0]=(2.1f);
           diziDouble[0]=(2d);
          for(String temp:diziString){
              System.out.println(temp);
          }
          String []diziColonu= diziString.clone();
            System.out.println("dizi kolonu: "+diziColonu[0].toString());
        }
    }
}
