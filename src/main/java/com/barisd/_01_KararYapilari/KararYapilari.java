package com.barisd._01_KararYapilari;
// Decision Structure
public class KararYapilari {
    public static void main(String[] args) {
        /*
        if(mantıksal ifade){
                // koşul doğruysa  çalışacak kodlar
            }

         */
        if(5>10){
            System.out.println("Kosul True Oldugu Icin bu satir calisti");
        }
        System.out.println("Kosuldan sonraki kodlar");

        /*
            if(mantıksal ifade){
                // koşul doğruysa çalışacak kodlar
            }
            else{
                // koşul doğru değilse çalışacak kodlar
            }

         */
        int sicaklik=-20;
        if(sicaklik<0){
            System.out.println("Kombiyi cok ac");
        }
        else if(sicaklik<10){
            System.out.println("Kombiyi az ac");
        }
        else if(sicaklik<20){
            System.out.println("Kombiyi azıcık ac");
        }
        else{
            System.out.println("Kombiyi kapat");
        }


        //Soru:
        /*
        Bir program yazmanız gerekiyor ve kullanıcıların yaşlarına göre mesaj alacaklar.
        18 yaş altı kullanıcılara "Bu içeriğe erişim izniniz yok."
        18-30 yaş aralığındaki kullanıcılara "İçeriği görüntülemek için yaşınız yeterli."
        30 yaş üstü kullanıcılara "Bu içerik sizin yaş grubunuza yönelik değildir." mesajı gösterilmelidir.
        (yas değişken değerini 25 vererek deneyebilirsiniz.)
         */

        int kullaniciYas=18;
        if (kullaniciYas<18){
            System.out.println("Bu icerige erisim izniniz yok");
        }
        else if (kullaniciYas<30) {
            System.out.println("Icerigi goruntulemek icin yasiniz yeterli");
        }
        else {
            System.out.println("Bu icerik sizin yas grubunuza uygun degil");
        }

        /**
         * Soru 2: Bir matematik oyunu yazıyorsunuz ve kullanıcının verilen soruya doğru cevap verip vermediğini
         * kontrol etmeniz gerekiyor. Eğer kullanıcı
         * doğru cevap verirse "Tebrikler! Doğru cevap.",
         * yanlış cevap verirse "Maalesef yanlış cevap, tekrar dene."
         * mesajı gösterilmelidir.
         */
        int sorununCevabi=5;
        int kullanicininVerdigiCevap=5;

        if (sorununCevabi==kullanicininVerdigiCevap) {
            System.out.println("Tebrikler! Doğru cevap.");
            System.out.println("100 puan");
        }
        else{
            System.out.println("Maalesef yanlış cevap, tekrar dene.");
            System.out.println("-10Puan");
            }

        /**
         * Soru 3:
         * Bir seyahat uygulaması yazıyorsunuz ve kullanıcının gideceği şehre göre bilet fiyatını hesaplamanız gerekiyor.
         * Ankara'ya gidecek kullanıcılara 100 TL,
         * İstanbul'a gidecek kullanıcılara 200 TL,
         * izmir'e gidecek kullanıcılara 150 TL,
         * diğer şehirlere gidecek kullanıcılara ise "Geçerli bir şehir seçiniz."
         * mesajı gösterilmelidir.
         */

        String sehir="Ankara";
        if(sehir.equals("Ankara")) {
            System.out.println("Bilet ücreti 100 TL");
        } else if (sehir.equals("İstanbul")) {
            System.out.println("Bilet Ücreti 200 TL");
        } else if (sehir.equals("İzmir")) {
            System.out.println("Bilet Ücreti 150 TL");
        } else {
            System.out.println("Lütfen geçerli bir şehir Girin!!");
        }


        /**
         * String Eşitlik Kontrolü
         */
        String ad="Barış";
        String ad2="Barış";

        System.out.println(ad==ad2);
        System.out.println(ad.equals(ad2));

        String soyad=new String("Demirci");
        String soyad2=new String("Demirci");
        System.out.println(soyad);
        System.out.println(soyad==soyad2); // bellekteki nesne eşitliğini kontrol eder.
        System.out.println(soyad.equals(soyad2));

        /**
         * TERNARY  (koşul)? (koşul doğruysa çalışacak kod) : (Koşul yanlışsa çalışacak kodlar)
         */
        int not=70;
        String sonuc=(not>=50)?"GECTI":"KALDI";
        System.out.println(sonuc);


        if(not>=50)
            sonuc="GECTI";
        else
            sonuc="KALDI";
        System.out.println(sonuc);

        // Bir sayının negatif mi pozitif mi olduğunu ternary ile bulalım.
        int sayi=10;
        String sonuc2=(sayi>=0)?"POZITIF":"NEGATIF";
        System.out.println(sayi+": "+sonuc2);

        // Bir sayının tek mi çift mi olduğunu ternary ile bulalım?
        sayi= 10;
        sonuc=((sayi%2)==0)?"çift":"tek";
        System.out.println(sonuc);

        // SWITCH CASE
        int ay=20;
        switch (ay){
            case 1:
                System.out.println("OCAK");
                break;
            case 2:
                System.out.println("SUBAT");
                break;
            case 3:
                System.out.println("MART");
                break;
            default:
                System.out.println("1-3 arasinda deger giriniz.");
                break;
        }
        int gun=6;
        System.out.println(
                switch (gun) {
                    case 1,2,3,4,5 -> "Hafta Ici";
                    case 6,7 -> "Hafta Sonu";
                    default -> "1-7 Arası Değer olmalı";
                } );


        String ay2="OCAK";
        switch (ay2){
            case "OCAK":
                System.out.println("1. AY");
                break;
            case "ŞUBAT":
                System.out.println(2);
                break;
            case "MART":
                System.out.println(3);
                break;
            default:
                System.out.println("....");
                break;
        }

        int n= 5;
       int sonuc3=  switch (n){
            case 1 -> {
                yield 10 + 20;
            }
            case 2 -> {
                int ornek1=20;
               yield  ornek1+30;
            }
           default -> 10;
        };
        System.out.println("Sonuc3= "+sonuc3);
    }


}
