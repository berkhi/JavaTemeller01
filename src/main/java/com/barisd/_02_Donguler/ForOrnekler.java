package com.barisd._02_Donguler;

import java.util.Scanner;

public class ForOrnekler {
    public static void main(String[] args) {
        /*
        for(başlangıç değeri;bitiş şartı;değişim){
            //çalıştırılacak kodlar.
        }
         */
        /* SONSUZ DÖNGÜ:
        for(;;){
            System.out.println("for calisti");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
        }
        System.out.println("****************");
        for (int i = 5; i < 10; i++) {
            System.out.println("i:" + i);
        }

        System.out.println("****************");
        for (int i = 5; i <= 10; i++) {
            System.out.println("i:" + i);
        }
        System.out.println("****************");
        for (int i = 0; i <= 10; i = i + 5) {
            System.out.println("i:" + i);
        }
        System.out.println("****************");
        for (int i = 100; i >= 0; i = i - 5) {
            System.out.println("i:" + i);
        }
        System.out.println("****************");
        for (int i = 0, j = 0; i < 10; i++, j = i * 2) {
            System.out.println("i:" + i + "j:" + j);
        }

        //Kullanıcıdan bir kelime alan ve bu kelimenin harflerini tersten yazdıran bir for döngüsü yazın.
        // length() => stringin uzunluğunu verir.
        // charAt(index) => verilen indexteki karakteri geri döner.

        //Berk:
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = sc.nextLine();



        System.out.print("Tersten yazılışı: ");
        for (int i =  kelime.length() - 1; i >= 0; i--) {
            System.out.print(kelime.charAt(i));
        }
       // 012345
       // KELIME



        // Ctrl+Shift+Enter
/*        if () {
        }
*/




        //1'den 100'e kadar olan sayıları ekrana yazdıran bir for döngüsü yazın. Ancak 3'ün katlarında "3KAT", 5'in katlarında "5KAT" ve hem 3 hem de 5'in katlarında "15KAT" yazdırın.
/*
        for (int i = 1; i < 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i+" 3ün  ve 5 in katıdır: ");
            } else if (i % 3 == 0) {
                System.out.println(i+" 3ün katıdır: " );
            } else if (i % 5 == 0) {
                System.out.println(i+" 5'in katıdır: ");
            } else {
                System.out.println(i);
            }
        }
*/
        // Kullanıcıdan bir sayı alan ve bu sayı kadar satır ve sütundan oluşan bir kare çizen iki for döngüsü yazın. * ile.
       /*
       String karakter="*";
       5 için:
        *****
        *****
        *****
        *****
        *****

        */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Kare uzunluğunu giriniz: ");
        int kareUzunluk = sc.nextInt();
        String karakter="*";

        for (int i = 0; i < kareUzunluk; i++) {
            for (int j = 0; j < kareUzunluk; j++) {
                System.out.print(karakter);
            }
            System.out.println();

        }*/
        //Kullanıcıdan bir sayı alan ve bu sayı kadar satır ve sütundan oluşan bir üçgen çizen bir for döngüsü yazın.
        /*

        *
        **
        ***
        ****
        *****

        */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Üçgen boyutunu giriniz: ");
        int boyut = sc.nextInt();
        String karakter="*";

        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(karakter);
            }
            System.out.println();
        }

         */

        /*
        Kullanıcıdan bir sayı alan ve bu sayı kadar satır ve sütundan oluşan bir TERS üçgen çizen bir for döngüsü yazın.
        *****
        ****
        ***
        **
        *
         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Üçgen boyutunu giriniz: ");
        int boyut = sc.nextInt();
        String karakter="*";

        for (int i = boyut; i > 0; i--) { //5,4,3,2,1
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <=boyut ; i++) { //1,2,3,4,5

            for (int j = boyut - i; j >= 0; j--) {//3,2,1,0
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = boyut; i > 0; i--) { //5,4,3,2,1
            for (int j = i; j > 0; j--) { //3,2,1
                System.out.print("*");
            }
            System.out.println(" ");
        }
*/
        //Kullanıcıdan bir sayı alan ve onun çarpım tablosu çizen bir for döngüsü yazın.
       /*
       Örnek Çıktı:
        3*1=3
        3*2=6
        ..
        ..
        3*10=30
        */
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("KAÇLAR: ");
        int kaclar = sc.nextInt();

        for (int i =1; i<=10; i++) {
            System.out.println(kaclar+" x "+ i + " = " + (kaclar*i));
        }

 */

        // Tüm çarpım tablosunu yazdırın.

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" KATLARI");
            for (int j = 1; j <= 10; j++) {
                int carpim = i * j;
                System.out.println(i + "x" + j + "=" + carpim);
            }
        }

        //For; iterasyon sayısı belli olan durumlarda kullanılabilir.
        // Diğer durumlarda;
        //While:
        //Do-While:    Koşula uymasa da en az 1 kere çalışması istenen kodlar varsa.
    }
}
