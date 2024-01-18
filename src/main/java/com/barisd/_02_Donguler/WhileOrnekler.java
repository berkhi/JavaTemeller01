package com.barisd._02_Donguler;

import java.util.Scanner;

public class WhileOrnekler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            while(koşul){

            }
         */
        // Ornek1: 1Den 10a kadar olan sayıların toplamı:
   /*
        int toplam=0;
        int i=1;
        while(i<=10){
            toplam+=i;
            i++;

        }
        System.out.println("toplam="+toplam);

        // Ornek2:
        boolean a;
        int b=1,c=2;

        while(a=(b<c)?true:false){
            System.out.println("b: "+b+ " c: "+c);
            b=(int) (10*Math.random());
            c=(int) (10*Math.random());
        }
        System.out.println("b: "+b+ " c: "+c);

        // Ornek3: Kullanıcıdan alınan sayıların toplamını bulan program.(0 girene kadar sayı almaya devam etsin)
        Scanner sc=new Scanner(System.in);
        toplam=0; // toplamanın etkisiz elemanı 0 olduğu için 0 verildi.
        System.out.println("Bir sayi giriniz: (0 ile sonlandirabilirsiniz)");
        int input;
        while ((input=sc.nextInt())!=0){
            toplam+=input;
            System.out.println("Bir sayi giriniz: (0 ile sonlandirabilirsiniz)");
        }
        System.out.println("Toplam="+toplam);

        //Ornek4: Faktoriyel hesaplama. 5!=5*4*3*2*1  5!=120
        // Kullanıcıdan alınan sayının faktoriyelini bulan programı while ile yazınız.
        //Can Deniz
        int faktoriyel = 1;
        System.out.println("Faktoriyelini almak istediğiniz bir sayı giriniz");
        int input2 = sc.nextInt();
        int firstInput = input2;

        while (input2>0)
        {
            faktoriyel *= input2;
            input2--;
        }

        System.out.println(firstInput+"!="+ faktoriyel);

        //Kenan
        System.out.println("Bir sayı girin:");
        int kullaniciSayi1 = sc.nextInt();
        int sonuc = 1;
        int sonSayi=kullaniciSayi1;

        if(kullaniciSayi1>0) {
            while (kullaniciSayi1 != 0) {
                sonuc = sonuc * kullaniciSayi1;
                kullaniciSayi1--;
            }
            System.out.println(sonSayi+"!: "+sonuc);
        }
        else {
            System.out.println("O'dan büyük sayı giriniz");
        }
*/
        //Ornek5. Kullanıcıdan alınan kelimenin tersten yazılışıyla, orjinali aynıysa POLINDROM  KELİMEDİR, (ABA)
        // değilse POLINDROM KELİME DEĞİLDİR. (BABA)

        // Ek Bilgi: charAt metodu ile ilgili indexteki karakter alınabilir.
        // Ek Bilgi: Stringlerde indexler 0dan başlar.
        // Ek Bilgi: Stringlerde son index string uzunluğunun bir eksiğidir. Sefa için string uzunluğu 4, son index 3tür.
        String ad="Sefa"; // 0 1 2 3
        System.out.println(ad); // Sefa
        System.out.println(ad.charAt(0)); //S
        System.out.println(ad.charAt(1)); //e
        System.out.println(ad.charAt(2)); //f
        System.out.println(ad.charAt(3)); //a
       // System.out.println(ad.charAt(4)); //Derlenme hatası! StringIndexOutOfBoundsException: Index 4 out of bounds for length 4
        //ASLAN
        /*

        System.out.println(" Kelime Giriniz:");
        final String word = sc.nextLine();
        boolean flag = true;
        int i = 0;
        while ( i < word.length()-1) {
            if (word.charAt(i) != word.charAt(word.length()-1 - i)){
                flag = false;
                break;
            }
            i++;
        }
        if(flag)
            System.out.println("Palindrom Kelime.");
        else
            System.out.println("Palindrom Kelime Değil.");

        System.out.println(" Kelime Giriniz:");
        String original = sc.nextLine();
        String reversed="";
        int index = 0;
        while (index < original.length() ) {
            char character = original.charAt((original.length()-1)-(index));
            reversed+=character;
            //System.out.print(character);
            index++;
        }
        if(original.equals(reversed))
            System.out.println("Palindrom Kelime.");
        else
            System.out.println("Palindrom Kelime Değil.");
*/
        // Ornek 6. length metodunu kullanmadan kullanıcıdan alınan kelimenin uzunluğunu bulunuz.(while)
        String isim="aslan";
        try {
            System.out.println(isim.charAt(5));
        }catch(Exception e){
            System.out.println("DEVAM");
        }
        System.out.println("DEVAM");



        System.out.println(" Kelime Giriniz:");
        String original = sc.nextLine();
        int uzunluk=0;
        int index=0;
        while(true){
            try {
                original.charAt(index);
                index++;
                uzunluk++;
            }
            catch (Exception hata){
                System.out.println(hata.getMessage());
              break;
            }
        }
        System.out.println(uzunluk);



    }


}
