package com.barisd._04_MathSinifi;

public class _00_Math {
    public static void main(String[] args) {
        //3 Sabit vardır.
        System.out.println(Math.PI); //3.141592653589793
        System.out.println(Math.E);
        System.out.println(Math.TAU);

        // bir dairenin alanı:
        double yaricap=5;
        double alan=Math.PI*Math.pow(yaricap,2); // Math.pow(taban,üs)
        System.out.println(alan);

        int x=-5;
        int y=Math.abs(x);
        System.out.println("abs(x)="+ y);

        x=40;
        y=20;
        int z=60;
        System.out.println("Math.max()="+Math.max(x,y));
        System.out.println("Math.min()="+Math.min(x,y));
        System.out.println("Math.max iç içe="+Math.max(Math.max(x,y),z));

        System.out.println("Math.sqrt(40)="+Math.sqrt(x)); // kare kök square root

        //Yuvarlama işlemleri
        //ceil: Sayıyı yukarı yuvarlar.
        double a=5.00099;
        System.out.println("Math.ceil(5.00099)= "+Math.ceil(a));
        //floor: Sayıyı aşağı yuvarlar.
        double b=5.9999;
        System.out.println("Math.floor(5.9999)= "+Math.floor(b));
        //round: En yakın tam sayıya yuvarlar.
        System.out.println(Math.round(a));
        System.out.println(Math.round(b));
        double c=5.49;
        System.out.println("Math.round(5.49)="+Math.round(c));
        double d=5.50;
        System.out.println("Math.round(5.50)="+Math.round(d));

        //random: 0-1 arasında rastgele bir sayı döndürür.
        System.out.println(Math.random());//0.37840923864812337




    }
}
