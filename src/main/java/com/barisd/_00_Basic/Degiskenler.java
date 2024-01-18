package com.barisd._00_Basic;

public class Degiskenler {
    public static void main(String[] args) {
        int i= -5;
        System.out.println(i);


        // boolean değişkenlere sadece true veya false değeri atanabilir.
        boolean gectiMi=true;
        gectiMi=false;
        // yanlış kullanımlar:
        // gectiMi=10;
        // gectiMi='a';
        // gectiMi="Deneme";
        // gectiMi=0;
        // gectiMi=1;
        gectiMi=true;
        gectiMi=false;

        // char tipli değişkenlere değer olarak tek tırnak içinde tek karakter veya 0-65535 arasında sayısal değer verilebilir.
        char karakter=65;
        karakter=65535;
        karakter='?';
        /* Yanlış kullanım
        karakter=65536;
        karakter=-50;
         karakter='AB';
         karakter="Deneme";
         karakter="A";
         */

        // byte tipli değişkenler -128 ile 127 arasında değer taşıyabilir. (8bit)
        byte byteDegisken=-128;
        byteDegisken=127;
        byteDegisken='a';
        /* Yanlış kullanım
        byteDegisken=128;
        byteDegisken=5000;
        byteDegisken='ü';
         */

        System.out.println(byteDegisken); // ekrana a nın ASCII table daki karşılığı olan 97 çıktısını verir.

        //short tipli değişkenler -32768 ile 32767 arasında değer taşıyabilir. (16bit)
        short shortDegisken=32767;
        shortDegisken=-32768;
        shortDegisken='ü';
         /* Yanlış kullanım
        shortDegisken=33000;
        shortDegisken="Deneme";
        shortDegisken=true;
        shortDegisken=false;
          */

        // int tipli değişkenler (32bit) Default tam sayı tipidir.
        int intDegisken=2_000_000_000;
               /* Yanlış kullanım
        intDegisken=4_000_000_000;
                */
        System.out.println(intDegisken);
        // long tipli değişkenler (64bit) Değerlerin sonuna L/l eklenerek tutulmalıdır.
        long longDegisken=40_000_000_000_000L;
        longDegisken=1L;
        System.out.println(longDegisken);


        // double (64bittir) Ondalıklı sayıları tutmak için kullanılan Default tiptir.
        double doubleDegisken=5.25;
        System.out.println(doubleDegisken);

        double sayi1=5.25;
        double sayi2=4.75;
        System.out.println(sayi1+sayi2);

        //float (32bittir) Değerlerin sonuna F/f eklenerek tutulmalıdır.
        float floatDegisken=5.25F;
        float sayi3=5.25f;
        float sayi4=4.25F;
        System.out.println(sayi3+sayi4);

        // HATALAR!
        float sayi5=0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f;
        System.out.println(sayi5); // beklenen:0.7 çıktısı:0.70000005

        float sayi6=0.1f*0.1f;
        System.out.println(sayi6); // beklenen:  0.01 çıktısı: 0.010000001

        // Declaration:
        int sayi10;
        // Initilization
        sayi10=100;

        // Definition = Declaration+Initilization
        int sayi20=200;

        // Var kullanımı. Burada tip çıkarımı yapılır.
        // var ile sadece local değişken oluşturulabilir.
        // var ile member değişken oluşturamazsınız.
        var ad="Barış";
        ad="Demir";
        //ad=545; HATA!!

        var sayi11=500L;
        sayi11=40_000_000_000_000L;













    }
}
