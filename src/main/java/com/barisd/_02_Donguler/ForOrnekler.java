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
         */
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






    }
}
