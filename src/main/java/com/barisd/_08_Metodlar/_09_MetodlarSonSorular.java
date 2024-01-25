package com.barisd._08_Metodlar;
/*
Soru 1: Bir tam sayı dizisini parametre olarak alan ve dizideki sayıların ortalamasını hesaplayarak geri döndüren bir ortalamaHesapla metodunu yazınız.

    public static void main(String[] args) {
        int dizi[] = {1,2,3,4,5};
        double ortalama = ortalamaHesapla(dizi);
        double ortalama2 = ortalamaHesaplaVarArgs(dizi);
        double ortalama3 = ortalamaHesaplaVarArgs(5,10,15);
        System.out.println(ortalama);
        System.out.println(ortalama2);
        System.out.println(ortalama3);
    }
    public  static  double ortalamaHesapla(int[] dizi) {
        double toplam =0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        return toplam/dizi.length;
    }
    public  static  double ortalamaHesaplaVarArgs(int... dizi) {
        double toplam =0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        return toplam/dizi.length;
    }

Soru 2: Bir tamsayı parametre alan ve sayının tek olup olmadığını kontrol eden bir tekMi metodunu yazınız.

//Soru 2: Bir tamsayı parametre alan ve sayının tek olup olmadığını kontrol eden bir tekMi metodunu yazınız.
    public static void main(String[] args)
    {

        System.out.println(tekMi(5));
        System.out.println(tekMi(6));

    }

    public static boolean tekMi(int sayi){

       return sayi%2==1;
    }

// Soru 3: Bir tam sayı dizisi parametre alan ve diziyi küçükten büyüğe doğru sıralayarak geri döndüren bir metod yazınız.
 public static void main(String[] args) {
        int dizi[] = {9,15,30,2,5};

        System.out.println(Arrays.toString(diziSirala(dizi)));
    }
//Soru 3: Bir tam sayı dizisi parametre alan ve diziyi küçükten büyüğe doğru sıralayarak geri döndüren bir metod yazınız.


    public static int[] diziSirala(int[] dizi) {
        Arrays.sort(dizi);
        return dizi;
    }
}

// Soru 4. İki tamsayı parametre alan ve taban üzeri üs işlemini hesaplayarak sonucu geri döndüren bir metod yazınız.


------
package org.example._08_MetodYazim;
//// Soru 4. İki tamsayı parametre alan ve taban üzeri üs işlemini hesaplayarak sonucu geri döndüren bir metod yazınız.
public class S14_06_Ex4 {
    public static void main(String[] args) {
        System.out.println(usHesapla(5,3));
        System.out.println(usHesapla(8,4));
    }
    public static int usHesapla(int taban, int us){
       int sonuc=1;
        for (int i = 0; i < us; i++) {
            sonuc=taban*sonuc;
        }
        return sonuc;
    }
}

// Soru 5. Bir metin parametre alan ve metindeki her kelimeyi tersine çevirerek geri döndüren bir metod yazınız.

public class soru5 {

    public static void main(String[] args) {
        String text = "Heval Can Aslan";
        System.out.println(Arrays.toString(kelimelereAyır(text)));
    }

    public static String[] kelimelereAyır(String text) {
        String[] kelimeler = text.split(" ");
        String[] tersKelimeler = new String[kelimeler.length];

        for (int i = 0; i < kelimeler.length; i++) {

            String kelime = kelimeler[i];
            StringBuilder tersKelime = new StringBuilder();
            tersKelimeler[i] = tersKelime.append(kelime).reverse().toString();
        }
        return tersKelimeler;
    }
}

// Soru 6. Bir tamsayı parametre alan ve sayının asal olup olmadığını kontrol eden asalMi metodunu yazınız.
 public static void main(String[] args) {



// Soru 6. Bir tamsayı parametre alan ve sayının asal olup olmadığını kontrol eden asalMi metodunu yazınız.


        System.out.println(asalMi(3));

    }
    public  static  boolean  asalMi(int sayi) {

        for (int i = 2; i <Math.sqrt(sayi); i++) {

            if (sayi%i == 0)
            return false;
        }
        return true;
    }


    }



  //soru 06 tam sayının asal olup olmadığını kontrol etme
        long baslagic = System.currentTimeMillis();
        System.out.println(asalMi(443));
        long bitis = System.currentTimeMillis();
        System.out.println("String ile geçen işlem süresi = " + (bitis - baslagic) + " ms");

        long baslagicSB = System.currentTimeMillis();
        System.out.println(asalMiKlasik(443));
        long bitisSB = System.currentTimeMillis();
        System.out.println("StringBuilder ile geçen işlem süresi = " + (bitisSB - baslagicSB) + " ms");

//Soru 7. Bir tam sayı dizisi ve bir tamsayı parametre alan ve dizideki her sayıyı, girilen 2. parametredeki değer ile çarparak yeni bir dizi oluşturan ve geri döndüren bir metod yazınız.

  public static void main(String[] args) {
        int dizi[]={1,2,3,4,5};

        System.out.println(Arrays.toString(diziElemanlariniCarpma(5,dizi)));
    }
    public static int [] diziElemanlariniCarpma(int carpan,int []dizi){
        int[]sonuc=new int[dizi.length];
        for (int i = 0; i <dizi.length ; i++) {
            sonuc[i]=carpan*dizi[i];

        }
        return sonuc;
    }

// Soru 8. Bir tam sayı dizisi ve bir tamsayı parametre alan ve dizideki en büyük n sayıyı içeren yeni bir dizi oluşturan ve geri döndüren bir metod.

   public static void main(String[] args) {
        int[] dizi = {13,2,1,4,5};
        System.out.println(Arrays.toString(enBuyuknElemanAlma(dizi,2)));
    }
    public static int[] enBuyuknElemanAlma(int[] dizi , int n){
        int enBuyuknSayiliDizi[] = new int[n];
        Arrays.sort(dizi);
        for (int i = 0; i<n; i++) {
            enBuyuknSayiliDizi[i] = dizi[dizi.length-1-i];
        }
        return enBuyuknSayiliDizi;
    }

//Soru 9. Bir metin dizisi ve bir ayırıcı parametre alan ve dizideki tüm kelimeleri ayırıcı ile birleştirerek geri döndüren bir metod.
public static void main(String[] args) {
        String[] kelimeler={"can", "deniz", "salih","sefa"};

        System.out.println(birlesikKelime(kelimeler,"---"));

    }
    public static String birlesikKelime(String[] dizi, String ayrac){
        StringBuilder stringBuilder= new StringBuilder();
        for (String item:dizi){
            stringBuilder.append(item);
            stringBuilder.append(ayrac);
        }
        return stringBuilder.toString().substring(0,stringBuilder.length()-ayrac.length());
    }


// Soru 10. Bir tam sayı dizisi parametre alan ve dizideki tek sayıları içeren yeni bir dizi oluşturan ve geri döndüren bir metod yazınız.

 public static void main(String[] args) {
        // Soru 10. Bir tam sayı dizisi parametre alan ve dizideki tek sayıları içeren yeni bir dizi oluşturan ve geri döndüren bir metod yazınız.

        int []sayilar={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(tekSayilar(sayilar)));

    }
    public static int[] tekSayilar(int[] dizi){

        int elemanSayisi=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1){
                elemanSayisi++;
            }
        }
        int[]tekSayilarDizisi=new int[elemanSayisi];
        int sayac=0;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2==1){
                tekSayilarDizisi[sayac]=dizi[i];
                sayac++;
            }
        }
        return tekSayilarDizisi;
    }

//Soru 11. Bir double dizisi parametre alan ve dizideki sayıların ortalamasını hesaplayan ve geri döndüren bir metod yazınız.





public class _11_GenelSoru {
    public static double diziOrtalamasi(double[] girilenDizi) {
        double toplam = 0;
        for (double item : girilenDizi) {
            toplam += item;

        }


        return toplam / (girilenDizi.length);

    }

    public static void main(String[] args) {
        //bir double dizisi parametre ala  ve dizideki sayoların ortalamasını geri döndüren
        double[] array = new double[]{20, 19, 20, 40, 3, 40, 5, 3, 7, 3};
        System.out.println(diziOrtalamasi(array));
        System.out.println(Arrays.stream(array).average());

    }
}

Soru 12. Verilen metin içindeki uygun karakter sayılarını kücükHarfSay(), buyukHarfSay(), rakamSay(), harfRakamHaricSay() metodlarını yazarak yazdırınız.

    public static int kucukHarfSay(String metin){
        int count = 0;
        for (int i = 0; i < metin.length(); i++) {
            if(Character.isLowerCase(metin.charAt(i))){
                count++;
            }
        }
        return count;
    }


//

 public static int harfRakamHaricSay(String metin){
        int count=0;
        for (int i = 0; i < metin.length(); i++) {
            char karakter=metin.charAt(i);
            if(!Character.isLetterOrDigit(karakter)){
                count++;
            }

        }
        return count;


public static int buyukHarfleriBul(String text){
        int count = 0 ;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static int rakamSay(String text){
        int count = 0 ;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }




 */
