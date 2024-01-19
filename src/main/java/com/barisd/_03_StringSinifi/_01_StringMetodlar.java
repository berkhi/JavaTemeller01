package com.barisd._03_StringSinifi;

public class _01_StringMetodlar {
    public static void main(String[] args) {
        //1.length() : Karakter Sayısı bilgisini döner.
        String str1="Merhaba";
        int uzunluk = str1.length();
        System.out.println(uzunluk);

        String str2="";
        uzunluk = str2.length();
        System.out.println(uzunluk);

        //HATA!!!
        String str3;
        //uzunluk = str3.length(); //Variable 'str3' might not have been initialized
        System.out.println(uzunluk);
/*
        String str4=null;
        uzunluk = str4.length(); // NullPointerException: Cannot invoke "String.length()" because "str4" is null
        System.out.println(uzunluk);
*/
        // charAt
        //    0123456
        str1="Merhaba";
        char c = str1.charAt(3);
        System.out.println(c);

        //son karakter?
        char sonKarakter=str1.charAt(str1.length()-1);
        System.out.println(sonKarakter);

       // str1.charAt(str1.length()); //StringIndexOutOfBoundsException: Index 7 out of bounds for length 7

        //substring
        str1="Merhaba";
        String substring = str1.substring(3); // belirtilen indexten başlayarak son karaktere kadar olan kısmı döner.
        System.out.println(substring);

        String substring1 = str1.substring(3, 5); //3 dahil, 5 hariç
        System.out.println(substring1);

        //concat
        str1="Merhaba";
        str2=str1.concat(" Java");
        System.out.println(str2);

        str2=str1+" Java";
        System.out.println(str2);

        //indexOf
        //    0123456
        str1="Merhaba";
        int strIndex = str1.indexOf('a');
        System.out.println(strIndex);

        strIndex = str1.indexOf("ha");
        System.out.println(strIndex);

        strIndex = str1.indexOf('a', 5);
        System.out.println(strIndex);
        // 01234567890123456789012
        // Bugün hava çok yağmurlu. Cümlesindeki a karakterinin bulunduğu indexleri dönün. (7,9,16)

        String cumle="augün hava az yağmurlu";
        System.out.println(cumle);
        /*for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i)=='a')
                System.out.println(i);
        }*/
        /*
        int a2=0;
        for (int index = cumle.indexOf('a'); index !=-1; index=cumle.indexOf('a',index+1)) {
            System.out.println(index);
        }


        String str5="augun hava az yagmurlu";
        a2=-1;
        for (int i = 0; i < str5.length(); i=i+a2) {
            a2 = str5.indexOf('a', a2+1);
            System.out.println(a2);
        }

         */


        //equals Stringlerdeki değerlerin eşit olup olmadığını kontrol eder.
        str1= "İlk Şaş";
        str2= "ilk şaş";
        boolean esitMi = str1.equals(str2);
        System.out.println(esitMi);
        boolean esitMiIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println(esitMiIgnoreCase);

        //compareTo
        // Eğer karşılaştırılan Stringler aynı ise 0 döner.
        // Eğer karşılaştırılan stringlerden ilki alfabetik olarak önde ise negatif döner.
        // A:65-90 :-25
        //Eğer karşılaştırılan stringlerden ilki alfabetik olarak sonra ise pozitif değer döner.
    // A:65 a:97 :  97-65=32
        str1="şaşı";
        str2="Şb";

        int i = str1.compareToIgnoreCase(str2);
        System.out.println(i);

        //toUpperCase
        str1="kış";
        System.out.println("kış büyük:"+str1.toUpperCase());

        //toLowerCase
        str1="JAVA";
        System.out.println(str1.toLowerCase());

        //trim: Stringin başındaki ve sonundaki boşlukları atar.
        str1=" JA VA ";
        System.out.println(str1.trim());

        //replace:
        str1="Merhaba Java";
        str2= str1.replace('a','o');
        System.out.println(str2);

        //replaceAll: regex ile değişim yaptırmak için.

        //contains:
        str1="Merhaba";
        boolean iceriyorMu = str1.contains("er");
        System.out.println(iceriyorMu);

        // Türkçe alfabedeki Büyük Harflerin ASCII değerlerini yazdırınız.
        // A -> 65
/*
        for (char j = 'A'; j <= 'Z'; j++) {
            System.out.println(j+"->"+(int)j);
        }
*/
        String alfabe="ABCÇDEFGHIİJKLMNOÖPRSŞTUÜVYZ";
        for (int j = 0; j < alfabe.length(); j++) {
            char harf = alfabe.charAt(j);
            System.out.println(harf +"->"+(int) harf);
        }

        //startsWith ve endsWith
        str1="Merhaba";
        boolean mIleBasladiMi = str1.startsWith("M");
        System.out.println(mIleBasladiMi);

        boolean zIleBasladiMi = str1.startsWith("Z");
        System.out.println(zIleBasladiMi);

        boolean aIleBittiMi=str1.endsWith("a");
        System.out.println(aIleBittiMi);

        boolean eIleBittiMi=str1.endsWith("e");
        System.out.println(eIleBittiMi);

        // Escape Characters
        System.out.print("Java 14 Grubu Ile \nString Dersleri Başladı!\n");
        System.out.print("\tAlt Başlık\n");
        System.out.println("\"Ankara\"");
        System.out.println(" Ters Slash \\ ");

        //String metodları chain şeklinde kullanılabilir. Sıralama önemlidir.
        str1=" Merhaba Java ";
        String replace = str1.trim().replace(" ", "!");
        System.out.println(replace);
        String replace2 = str1.replace(" ", "!").trim();
        System.out.println(replace2);

        //split
        String mesaj="Bu dünya ne sana ne bana kalmaz!";
        String[] sdizi = mesaj.split(" ");
        System.out.println(sdizi.length);
        for (int j = 0; j < sdizi.length; j++) {
            System.out.println(sdizi[j]);
        }

        // girilen mail adresi içinde @ işareti var mı kontrolü yapalım.
        String email="asd.gmail.com";
        String email1="asd@gmail.com";

        System.out.println( email.contains("@"));
        System.out.println( email1.contains("@"));

        for (int j = 0; j < email1.length(); j++) {
            if(email1.charAt(j)=='@') {
                System.out.println("Email Doğru");
                return;
            }
        }
        System.out.println("Email Yanlış");



    }

}
