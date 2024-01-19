package com.barisd._03_StringSinifi;

import java.util.Scanner;

public class _02_StringBuilder {
    /**
     * String ile oluşturulan nesneler unmutable, StringBuilder ise mutable.
     * StringBuilder üzerinde yapılan bir değişiklik orjinal nesneyi değiştirir. Yeni bir nesne oluşturmaz.
     * String üzerinde yapılan değişiklik yeni bir nesne oluşturur.
     * Ekleme ve değişiklik işlemleri sıkça yapılıyorsa StringBuilder sınıfını kullanmanız önerilir.
     * StringBuffer -> multi thread uygulamalarda çalışır.
     * StringBuilder -> multi thread uygulamalarda güvenli değildir.
     * @param args
     */
    public static void main(String[] args) {
        //Yeni bir StringBuilder nesnesi oluşturma:
        StringBuilder sb=new StringBuilder();
        // StringBuildera metin ekleme
        sb.append("Örnek Metin");
        sb.append(" Java");
        System.out.println(sb);

        String str="Örnek Metin"; // Yeni bir string nesnesi: "Örnek Metin"
        str +=" Java"; // bu adımda yeni bir string nesnesi oluşturur.  "Örnek Metin Java"
        System.out.println(str);


        sb.replace(0,5,"Be");
        System.out.println(sb);

        System.out.println(sb.substring(0,8));
        System.out.println(sb);

        sb.insert(3," eklenen ");
        System.out.println(sb);

        sb.delete(3,12);
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder();
        sb1.append("Metin");
        sb1.reverse();
        System.out.println(sb1);

        //StringBuilder ile girilen kelime polindrom mu kontrolü...
        Scanner sc=new Scanner(System.in);
        StringBuilder girilenKelime=new StringBuilder();
        System.out.println("POLINDROM TESTI İÇİN KELİME GİRİNİZ");
        girilenKelime.append(sc.next());

        StringBuilder tersKelime=new StringBuilder(girilenKelime);
        tersKelime.reverse();
        System.out.println("Girilen Kelime:"+girilenKelime);
        System.out.println("Ters Kelime:"+tersKelime);

        if(girilenKelime.toString().equals(tersKelime.toString()))
            System.out.println("POLINDROM");
        else
            System.out.println("POLINDROM DEĞİL");
    }
}
