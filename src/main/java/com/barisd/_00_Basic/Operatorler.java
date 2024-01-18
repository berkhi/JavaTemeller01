package com.barisd._00_Basic;

public class Operatorler {
    public static void main(String[] args) {
        // Atama Operatörü =
        int i=5;
        // Birleşik Atama Operatörleri:
        // += , -=, *=, /= %=
        i+=2; // i=i+2  i=7
        i-=2; // i=i-2  i=5
        // İkili Aritmetik Operatörler
        // + - * / %
        i= 8+2;
        i= 10-5;
        i= i*5;
        i= i/i;
        i= 10%2; // MOD ALMA YANİ KALANI BULMA Sonuç 0 olur.

        // i+2; HATA!!!

        // Tekli Aritmetik Operatörler
        // ++, --, + , -

        i= +5;
        i= -5;
        i -= 5;
        i++; // i=i+1 // sonra artırma post increment
        i--; // i=i-1 // sonra eksiltme post decrement

        ++i; // önce artırma pre increment
        --i; // önce eksiltme pre decrement

        i=5;
        int j= ++i; // önce artırmayı yaptı sonra değeri atadı.
        System.out.println("i= "+i+" j= "+ j);

        i=5;
        j= i++; // önce atamayı yaptı, sonra artırma işlemini yaptı.
        System.out.println("i= "+i+" j= "+ j); // i= 6 j= 5

        j=--i;
        System.out.println("i= "+i+" j= "+ j); //i= 5 j= 5

        j=i--;
        System.out.println("i= "+i+" j= "+ j); //i= 4 j= 5

        // Tekli Mantıksal Operatör
        // ! = Mantıksal olarak değerin tersini almaya yarar.
        boolean acikMi=true;
        System.out.println(!acikMi); // ekrana false yazar.

        // Kıyaslama Operatörleri
        // <, <=, >, >=, ==, != Bu operatörlerin kullanımı sonucunda True veya False değer dönerler.

        boolean sonuc= 10!=5;
        System.out.println(sonuc);

        System.out.println(10<20);

        // Şart Operatörleri
        // &, |, &&, ||, ^, !
        int x=5;
        int y=10;
        int sayi=12;
        boolean aradaMi= (sayi>x)  ||  (sayi<y);
        System.out.println("Arada mi= "+aradaMi);

        boolean sonuc2= false && true;
        System.out.println(sonuc2);

        // Tek 3 lü operatör : Ternary Operatör
        // (koşul) ? (doğruysa) :(yanlışsa)

        i=30;
        j=20;
        int min=(i<j) ? i : j;
        System.out.println(min);

        // Bit Operatörleri
        // & , | , ^, ~, >>, <<, >>>

        int sonuc3= 5 * 3 +5 /5 -3 ;
        System.out.println(sonuc3);

        // işlem öncelik sırası : java operator priority // java precedence
        // parantezler değerlendirme önceliklidir.

        // Operatör Overloading: Aşırı yükleme + Toplama/Birleştirme
        System.out.println("Ad "+"Soyad");
        System.out.println("Ad "+5);
        System.out.println(5+"soyad");
        System.out.println(10+5);
        System.out.println("10"+"5");

        // + operatörü char ile kullanım:
        char a='a',b='b';
        System.out.println(a+b); //195
        System.out.println('a'+ 10);
        System.out.println("A"+'a');
        System.out.println('a');

        int charA=a;
        System.out.println(charA);









    }
}
