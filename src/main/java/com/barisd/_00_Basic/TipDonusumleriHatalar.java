package com.barisd._00_Basic;

public class TipDonusumleriHatalar {
    public static void main(String[] args) {
        int i=5;
        double d=2.5;

        // i=i+d; // sonuç double olacağı için int değişkende saklanamaz!
        i=(int)(i+d); // cast işlemi ile bu sorun çözülür.
        System.out.println(i);

        byte b1=8, b2=5;
        // byte b3=b1+b2; // Hata işlem sonucunda ortaya çıkan değer Default olarak int olur.
        byte b3=(byte) (b1+b2);
        System.out.println(b3);

        i=5;
        // i=i+d; HATA!! bu şekilde otomatik tip dönüşümü yapmaz!
        i+=d; // Birleşik atama operatörleri Otomatik tip dönüşümü yapar.
        System.out.println(i);

    }
}
