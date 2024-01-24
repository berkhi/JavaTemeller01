package com.barisd._08_Metodlar.kaan;

public class YardimciSinif {

    // Erişim sıralaması
    // public > protected > default(erişim belirteçsiz) > private

    // public metodlara bütün packagelardan erişim sağlanabilir.
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    // protected metodlara sadece aynı package içinden erişim sağlabilir.
    protected static double topla(double v, double v1) {
        helloYaz();
        selamVer();
        return v+v1;
    }


    public int topla(int sayi1,int sayi2, int sayi3){
        return sayi1+sayi2+sayi3;
    }
    // farklı packageden erişim yok.
    // aynı packageda farklı classtan erişim yok.
    // sadece yazıldığı class içinde erişim var.
    private static void helloYaz(){
        System.out.println("Hello");
    }
    // erişimm belirteci kullanmazsak:
    // farklı packageden erişim yok.
    // aynı package içindeki farklı classlardan erişim var.

    static void selamVer(){
        System.out.println("Selam");
    }
}
