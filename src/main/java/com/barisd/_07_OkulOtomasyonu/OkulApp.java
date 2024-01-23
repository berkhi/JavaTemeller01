package com.barisd._07_OkulOtomasyonu;

import java.util.Arrays;
import java.util.Scanner;

public class OkulApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secim;
        String[] sinifListesi=null;
        int sinifMevcudu=0;
        double[] matNotlari=null;
        do {
            System.out.println("***********************************");
            System.out.println("**********OKUL OTOMASYONU**********");
            System.out.println("***********************************");
            System.out.println("1-Sınıf Tanımla");
            System.out.println("2-Öğrenci Tanımla");
            System.out.println("3-Öğrenciye Not Ver");
            System.out.println("4-Sınıf Listele");
            System.out.println("5-Notları Listele");
            System.out.println("0-Çıkış");
            System.out.print("Seçiminizi giriniz:");

            secim = sc.nextInt(); sc.nextLine(); //Enter yok etmek için.

            switch (secim) {
                case 1:
                    System.out.println("***********************************");
                    System.out.println("************SINIF TANIMLA**********");
                    System.out.println("***********************************");

                    System.out.println("Sınıf mevcudunu giriniz:");
                    sinifMevcudu=sc.nextInt(); sc.nextLine(); //Enter yok etmek için.
                    sinifListesi=new String[sinifMevcudu];
                    System.out.println("Sınıf başarıyla oluşturuldu.");
                    break;
                case 2:
                    System.out.println("***********************************");
                    System.out.println("**********ÖĞRENCİ TANIMLA**********");
                    System.out.println("***********************************");

                    for (int i = 0; i < sinifListesi.length; i++) {
                        System.out.println((i+1)+". Öğrencinin Adını Giriniz:");
                        sinifListesi[i]=sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("***********************************");
                    System.out.println("*************NOT VER***************");
                    System.out.println("***********************************");

                    matNotlari=new double[sinifMevcudu];
                    for (int i = 0; i < matNotlari.length; i++) {
                        System.out.println(sinifListesi[i]+" nin 1. notunu giriniz:");
                        int not1=sc.nextInt(); sc.nextLine();
                        if(not1>100 || not1<0){
                            System.err.println("Not 0-100 arasında olmalıdır");
                            // Aynı indis için tekrar çalıştırmak istersek:
                            i--;
                            continue;
                        }

                        System.out.println(sinifListesi[i]+" nin 2. notunu giriniz:");
                        int not2=sc.nextInt(); sc.nextLine();
                        if(not2>100 || not2<0){
                            System.err.println("Not 0-100 arasında olmalıdır");
                            i--;
                            continue;
                        }
                        matNotlari[i]=(not1+not2)/2;
                    }
                    break;
                case 4:
                    System.out.println("***********************************");
                    System.out.println("************SINIF LİSTESİ**********");
                    System.out.println("***********************************");
                    System.out.println(Arrays.toString(sinifListesi));
                    System.out.println("Ana menü için Enter'a basınız.");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("***********************************");
                    System.out.println("************NOT LİSTESİ**********");
                    System.out.println("***********************************");
                    System.out.println("Ad\t\tMat Not");
                    for (int i = 0; i < sinifMevcudu; i++) {
                        System.out.println(sinifListesi[i]+"\t\t"+matNotlari[i]);
                    }
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
