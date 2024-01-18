package com.barisd._00_Basic;

public class TipDonusumleri {
    public static void main(String[] args) {
        int x=20;
        long y=x; // int -> longa dönüştürüldü. (otomatik)

        // HATA!!!
        // byte z=  x; // int -> byte otomatik dönüştürme işlemi yapmaz!

        System.out.println(y);

        long longDegisken=4_000_000_000_000_000_000L;
        double doubleDegisken=longDegisken;
        System.out.println(doubleDegisken);

        float floatDegisken=longDegisken;
        System.out.println(floatDegisken);

        float a=15f;


        byte bVar=50;
        short sVar=250;
        int iVar=10000;
        long lVar=1L;

        long z=bVar+lVar;

        float fVar=50f;
        double dVar=50.25;

        double c= fVar+fVar;

        char charVar='a';
        lVar=charVar;

        int k;
        double l=99.999;
        // cast işlemi güvenli değildir. Veri kaybı yaşanabilir.
        k=(int)l;
        System.out.println(k);

        //

        byte byteVar;
        int intVar=256;

        byteVar=(byte)intVar;
        System.out.println(byteVar);

        String ad="Barış";

        int sayi=50;
        // Wrapper Class
        Integer sayi1=500;

        char char2=(char)-65;
        System.out.println(char2);

        System.out.println("barış");

    }
}
