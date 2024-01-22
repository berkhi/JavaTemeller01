package com.barisd._06_Diziler;

public class _10_CokBoyutluDiziOrnegi {
    public static void main(String[] args) {
        /*
        Sno     No         Ad       Not
        1       101        Ece      100
        2       102        Su       80
        3       103        Ali      70
        4       104        Can      40
     Bu yapı çok boyutlu dizide tutulabilir mi?
         */
        String[][] sinifListesi2={
                {"1","101","Ece","100"},
                {"2","102","Su","80"},
                {"3","103","Ali","70"},
                {"4","104","Can","40"}
        };


        String[][] sinifListesi=new String[4][4];
        sinifListesi[0][0]="1";
        sinifListesi[0][1]="101";
        sinifListesi[0][2]="Ece";
        sinifListesi[0][3]="100";

        sinifListesi[1][0]="2";
        sinifListesi[1][1]="102";
        sinifListesi[1][2]="Su";
        sinifListesi[1][3]="80";

        sinifListesi[2][0]="3";
        sinifListesi[2][1]="103";
        sinifListesi[2][2]="Ali";
        sinifListesi[2][3]="70";

        sinifListesi[3][0]="4";
        sinifListesi[3][1]="104";
        sinifListesi[3][2]="Can";
        sinifListesi[3][3]="40";


        // sinifListesi dizisindeki elemanların tamamını yazdırınız.
        for (int i = 0; i < sinifListesi.length; i++)
        {
            for (int j = 0; j < sinifListesi[i].length; j++)
            {
                System.out.print(sinifListesi[i][j]+"\t\t");
            }
            System.out.println();
        }
        // sinifListesi dizisinin 0. satırını yazdırma:

        int goruntulenecekSatirIndexi=1;
        System.out.println(goruntulenecekSatirIndexi+". satır:");
        for (int i = 0; i < sinifListesi[goruntulenecekSatirIndexi].length; i++)
        {
            System.out.print(sinifListesi[goruntulenecekSatirIndexi][i] + "\t\t");
        }

        //sinifListesi dizisinin 2. sütununu yazdırma:
        int goruntulenecekSutunIndexi=3;
        System.out.println("\n"+goruntulenecekSutunIndexi+". Sütun: ");
        for (int i = 0; i < sinifListesi.length; i++) {
            System.out.println(sinifListesi[i][goruntulenecekSutunIndexi] + " ");
        }

        //dizideki not sütunundaki notların toplamını ve ortalamasını yazdırınız:
        //int notToplami=sinifListesi[0][3]+sinifListesi[1][3];

        double sum =0;
        for (int i = 0; i < sinifListesi2.length; i++) {
            sum += Integer.parseInt(sinifListesi2[i][3]);
        }
        System.out.println("Toplam: "+sum+ " Ortalama: " + sum/sinifListesi2.length);
    }
}
