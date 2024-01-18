package com.barisd._00_Basic;

import java.math.BigDecimal;

public class BigDecimalOrnek {
    public static void main(String[] args) {
        int sayi1=10;
        double sayi2=5.25;
        float sayi3=7.5F;

        BigDecimal sayi4=new BigDecimal("10.0");
        BigDecimal sayi5=new BigDecimal("0.1");
        BigDecimal sayi6=new BigDecimal("0.0");

       /* sayi6=sayi6.add(sayi5);
        sayi6=sayi6.add(sayi4);*/

        for (int i = 0; i < 7; i++) {
            sayi6=sayi6.add(sayi5);
        }

        sayi6=sayi5.multiply(sayi4);

        System.out.println(sayi6);

    }
}
