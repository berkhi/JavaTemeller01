package com.barisd._02_Donguler;

public class BreakOrnek {
    public static void main(String[] args) {
        //For ile Break
        /*
        for (int i = 0; i < 10; i++) {

            if(i==5)
                break;
            System.out.println(i);

        }

        System.out.println("Döngü bitti.");

         */

        //while ile break
        /*
        int i=0;
        while(i<10){
            if(i==5)
                break;
            System.out.println(i);
            i++;
        }
        System.out.println("Döngü Bitti");
*/
        // do while ile break
        /*
        int i=0;
        do{
            if(i==5)
                break;
            System.out.println(i);
            i++;
        }while(i<10);
        System.out.println("Döngü Bitti");

         */

        // İç içe for döngüsünde Etiketli Labeled Break
        dongu:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==2 && j==2)
                    break dongu;
                System.out.println("i:"+i+"j:"+j);
            }
        }
        System.out.println("Döngü Bitti");
    }
}
