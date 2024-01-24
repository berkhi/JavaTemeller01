package com.barisd._07_OkulOtomasyonu;

import java.util.Arrays;
import java.util.Scanner;

public class OkulAppWithMetods {
    public static void baslikYazdir(String baslik){
        System.out.println("***********************************");
        System.out.println("************"+baslik+"**********");
        System.out.println("***********************************");
    }

   // [09:05] Salih Ertuğrul Er (BilgeAdam Boost)
    public static void basliklar (String baslik) {
        String baslik1 = baslik;
        for (int i=0; i<(12+baslik1.length()); i++){
            System.out.print("*");
        }
        System.out.println();
        for (int j=0; j<5;j++) {
            System.out.print("*");
        }
        System.out.print(" "+baslik1+" ");
        for (int j=0; j<5;j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i=0; i<(12+baslik1.length()); i++){
            System.out.print("*");
        }
        System.out.println();
    }

    //Mina:
    public static String baslik(String a){
        System.out.println("****************************************");
        for (int j = 0; j < ((40-a.length())/2); j++) {
            System.out.print("*");
        }
        System.out.print(a);
        for (int j = 0; j < ((40-a.length())/2); j++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("****************************************");
        return a;
    }
    //Aslan:
    public static void printTitle(String title) {
        int lineLength = 35;
        System.out.println(getCharacterLine(lineLength, '*'));
        System.out.println(getCenteredText(title, lineLength));
        System.out.println(getCharacterLine(lineLength, '*'));
    }
    public static String getCenteredText(String text, int lineLength) {
        int paddingLength = (lineLength - text.length()) / 2;
        String padding = new String(new char[paddingLength]).replace('\0', '*');
        return padding + text + padding;
    }
    public static String getCharacterLine(int lineLength, char character) {
        return new String(new char[lineLength]).replace('\0', character);
    }


    //Sami:
    public static void printMenu(String title) {
        int lineLength = 40;
        System.out.println("*".repeat(lineLength));
        int starLength = (lineLength - title.length()) / 2;
        System.out.println("*".repeat(starLength) + title + "*".repeat(starLength+1));
        System.out.println("*".repeat(lineLength));
    }

    //Can Deniz:
    private static void anaMenuyeDondur(Scanner sc) {
        System.out.println("Ana menü için Enter'a basınız.");
        sc.nextLine();
    }
    //Salih:


    private static void anaMenuyuGoster() {
        System.out.println("1-Sınıf Tanımla");
        System.out.println("2-Öğrenci Tanımla");
        System.out.println("3-Öğrenciye Not Ver");
        System.out.println("4-Sınıf Listele");
        System.out.println("5-Notları Listele");
        System.out.println("0-Çıkış");
    }

    //Aslan:

    /**
     * Kullanıcıdan değer almaya yarar.
     * @param sc Scanner nesnesi
     * @param soru Kullanıcıya gösterilecek soru
     * @return Kullanıcının girdiği değeri String olarak döner.
     */
    private static String getSecim(Scanner sc,String soru) {
        System.out.print(soru);
        return sc.nextLine();
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secim;
        String[] sinifListesi=null;
        int sinifMevcudu=0;
        double[] matNotlari=null;

        do {
            printMenu("OKUL OTOMASYONU");
            anaMenuyuGoster();
            secim =Integer.parseInt(getSecim(sc,"Seçiminizi giriniz:"));

            switch (secim) {
                case 1:
                    printMenu("SINIF TANIMLA");
                    sinifMevcudu=Integer.parseInt(getSecim(sc,"Sınıf mevcudunu giriniz:"));
                    sinifListesi=new String[sinifMevcudu];
                    System.out.println("Sınıf başarıyla oluşturuldu.");
                    break;
                case 2:
                    printMenu("ÖĞRENCİ TANIMLA");
                    for (int i = 0; i < sinifListesi.length; i++) {
                        sinifListesi[i]=getSecim(sc,(i+1)+". Öğrencinin Adını Giriniz:");
                    }
                    break;
                case 3:
                    printMenu("NOT VER");
                    matNotlari=new double[sinifMevcudu];
                    for (int i = 0; i < matNotlari.length; i++) {
                        int not1=Integer.parseInt(getSecim(sc,sinifListesi[i]+" nin 1. notunu giriniz:"));

                        if(not1>100 || not1<0){
                            System.err.println("Not 0-100 arasında olmalıdır");
                            // Aynı indis için tekrar çalıştırmak istersek:
                            i--;
                            continue;
                        }

                        int not2=Integer.parseInt(getSecim(sc,sinifListesi[i]+" nin 2. notunu giriniz:"));

                        if(not2>100 || not2<0){
                            System.err.println("Not 0-100 arasında olmalıdır");
                            i--;
                            continue;
                        }
                        matNotlari[i]=(not1+not2)/2;
                    }
                    break;
                case 4:
                    printMenu("SINIF LİSTESİ");
                    System.out.println(Arrays.toString(sinifListesi));
                    anaMenuyeDondur(sc);
                    break;
                case 5:
                    printMenu("NOT LİSTESİ");
                    System.out.println("Ad\t\tMat Not");
                    for (int i = 0; i < sinifMevcudu; i++) {
                        System.out.println(sinifListesi[i]+"\t\t"+matNotlari[i]);
                    }
                    anaMenuyeDondur(sc);
                    break;
                case 0:
                    System.out.println("Programdan çıkış yapıldı.");
                    break;
                default:
                    System.out.println("0-5 arası değer girmelisiniz.");
                    break;
            }
        }while (secim!=0);
    }

}
