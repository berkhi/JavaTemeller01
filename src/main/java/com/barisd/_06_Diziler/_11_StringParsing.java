package com.barisd._06_Diziler;

public class _11_StringParsing {
    public static void main(String[] args) {
        //Herhangi bir string içinde sayısal bir değer varsa Parse metodları ile onu sayısal değere çevirebilirsiniz.
        String sinavNot1="75";
        String sinavNot2="100";

        int not1=Integer.parseInt(sinavNot1);
        int not2=Integer.parseInt(sinavNot2);

        System.out.println(not1+not2);

        String kilo="70.240";
        System.out.println(Double.parseDouble(kilo)*2);

    }
}
