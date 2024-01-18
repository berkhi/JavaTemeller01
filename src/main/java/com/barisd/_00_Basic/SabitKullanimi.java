package com.barisd._00_Basic;

public class SabitKullanimi {
    public static void main(String[] args) {
        //Değişken oluşturma
        int i=10; //Değişkene ilk değer ataması
        i=20; // Değişkene yeni değer ataması.

        //Sabit (Constant) Oluşturma
        // final keywordü ile tanımlanan değişkenin değeri değiştirilemez.
        final int a=20;
        // a=25; !!HATA

        final String ad;
        ad="Barış";
        // ad="Salih"; !!!HATA

        // Kullanım yerleri:
        final String RESIM_YOLU="api/v1/images/";
        final double PI =3.14;
        final double CEVRE= 2 * PI * 5;
        //CEVRE=50; HATA




    }
}
