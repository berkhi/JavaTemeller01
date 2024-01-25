package com.barisd._08_Metodlar;

public class _04_MetodPassByValue {

    public static void artir(int i) {
        i++;
        System.out.println("i nin değeri=" + i); //11
    }

    // Tekrar edilecek!
    public static void artirKafamaGore(Adet adet1) {
        adet1.i++;
        adet1.i = adet1.i * 5;
        System.out.println("Adet içindeki i değeri:" + adet1.i); //6
    }

    public static void main(String[] args) {
        int sayi = 10;
        artir(sayi);
        System.out.println("Sayı değişkenin değeri=" + sayi); //10

        Adet adetReferans = new Adet(); // yeni bir Adet nesnesi türetiyoruz.
        artirKafamaGore(adetReferans);
        System.out.println("adetReferansin i değeri:" + adetReferans.i); // 6 ?
    }

    // Çıktısı:
    /*
    i nin değeri=11
    Sayı değişkenin değeri=10
     */
}

class Adet {
    int i = 5; //field

}
