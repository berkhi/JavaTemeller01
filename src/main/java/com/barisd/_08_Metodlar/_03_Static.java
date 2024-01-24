package com.barisd._08_Metodlar;

import java.util.Scanner;

public class _03_Static {

    int sayi1=10; // non-static field
    static int sayi2=20; // static-field

    public void selam(){
        System.out.println("Selam");
    }

    public void helloYaz(){
        System.out.println("Hello");
        System.out.println(sayi1); // static olmayan metod içine static olmayan bir field çağrılabilir.
        System.out.println(sayi2); // static olmayan metod içine static olan bir field da çağrılabilir.
        selam();
    }

    public static void main(String[] args) {
       // helloYaz(); // static metod içine static-olmayan metod ÇAĞRILAMAZ!
       // System.out.println(sayi1); // static metod içine static-olmayan field ÇAĞRILAMAZ!
        System.out.println(sayi2); // static metod içine static field çağrılabiliyor.
        System.out.println(Math.PI); // PI field'i static olduğu için Math sınıfına bağlıdır.
        Scanner sc= new Scanner(System.in); //Yeni bir Scanner nesnesi oluşturuyoruz.
        sc.next(); // nesne üzerinden static-olmayan metodlara veya fieldlara erişebiliriz.,
        // selam(); static metod içine static-olmayan metod ÇAĞRILAMAZ!


    }
    // static fieldlar veya metodlar sınıfa bağlıdır.
}
