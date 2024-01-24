package com.barisd._08_Metodlar;

public class _06_GetterSetterMetodKullanimi {
    public static void main(String[] args) {
        //Değişkenler
        String isim;
        String soyisim;
        String ogrenciNo;
        double kilo;
        double boy;
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.isim = "Sami";
        ogrenci1.setKilo(150);

        System.out.println(ogrenci1.isim);
        System.out.println(ogrenci1.getKilo());

    }
}

class Ogrenci {
    //özellikler:
    // field , properties:
    String isim;
    private String soyisim;
    private String ogrenciNo;
    private double kilo;
    private double boy;

    // Get Metodları
    public double getKilo() {
        return kilo;
    }

    // davranışlar:
    // Set Metodları:
    public void setKilo(double kilo) {
        if (kilo > 0) {
            this.kilo = kilo;
        }
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
}
