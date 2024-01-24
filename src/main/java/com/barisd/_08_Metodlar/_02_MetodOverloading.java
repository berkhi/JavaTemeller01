package com.barisd._08_Metodlar;

public class _02_MetodOverloading {
    public static void main(String[] args) {
        System.out.print(""); // 9 farklı print() metodu var.
        // Aynı metod ismi ile farklı parametrelere sahip metodlar oluşturmaya Metod Overloading denir. Aşırı Yükleme.
        // Operatör Overloading: + : Birleştirme, Toplama

        int toplam = topla(5, 3);
        System.out.println(toplam);

        int toplam2 = topla(5, 3,15);
        System.out.println(toplam2);

        System.out.println(topla(3,4,5,6,7));

        System.out.println(topla(3,4,5,6,7,10,12,15));

    }

   /* public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }*/
    // Varargs kullanımı: Değişken sayıda argüman alabilen metod yazmak için varargs yöntemi tercih edilebilir.
    // burada sayilar metod gövdesinde bir dizi gibi kullanılabilir.
    // bir metod parametre olarak sadece 1 tane varargs alır.
    // Metodun parametre listesinde varargs parametre en sonda olmalıdır.
    public static int topla(int... sayilar){
        int toplam=0;
        for (int item:sayilar)
            toplam+=item;
        return toplam;
    }

}
