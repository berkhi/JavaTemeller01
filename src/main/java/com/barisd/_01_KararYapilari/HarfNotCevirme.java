package com.barisd._01_KararYapilari;

import java.util.Scanner;

/**
 * Scanner** Kullanıcının girdiği not bilgisine göre harf notu hesaplayan bir program yazmanız gerekiyor.
 * 90-100 arası AA,
 * 80-89 arası BA,
 * 70-79 arası BB,
 * 60-69 arası CB,
 * 50-59 arası CC,
 * 40-49 arası DC,
 * 30-39 arası DD,
 * 0-29 arası FF olarak belirlenmiştir.
 * Başka bir not için "Geçerli not giriniz"
 * Bu durumda if  -else-if  -else yapısı
 * kullanarak bir program yazabilirsiniz.
 */
public class HarfNotCevirme {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int not;
        System.out.println("Notunuzu girin:");
        not= sc.nextInt();
        if(not<29){
            System.out.println("Notunuz FF");
        }
        else if(not<39){
            System.out.println("Notunuz DD");
        }
        else if(not<49){
            System.out.println("Notunuz DC");
        }
        else if(not<59){
            System.out.println("Notunuz CC");
        }
        else if(not<69){
            System.out.println("Notunuz CB");
        }
        else if(not<79){
            System.out.println("Notunuz BB");
        }
        else if(not<89){
            System.out.println("Notunuz BA");
        }
        else if(not<100){
            System.out.println("Notunuz AA");
        }
        else{
            System.out.println("Geçerli bir not giriniz.");
        }
    }
}
