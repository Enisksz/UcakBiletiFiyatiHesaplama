package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double toplam=0,indirim;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz: ");
        mesafe = input.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz(1==> Tek Yön, 2==> Çift Yön): ");
        yolculukTipi = input.nextInt();

        //Pozitif sayı girdiyse
        if (mesafe>0 && yas>0 && yolculukTipi>0){

            toplam += (mesafe*(0.10));
            System.out.println("Normal tutar: " +toplam + " TL");

            if (yas>65){
                indirim = 0.3;
                switch (yolculukTipi) {
                    case 1 -> {
                        toplam = mesafe * (0.10);
                        indirim = toplam * (0.30);
                        toplam = toplam - indirim;
                        System.out.println("İndirim: " + indirim + " TL");
                    }
                    case 2 -> {
                        toplam = mesafe * (0.10);
                        indirim = toplam * (0.50);
                        toplam = toplam - indirim;
                        System.out.println("İndirim: " + indirim + " TL");
                    }
                }
                System.out.println("İndirimli Tutar: " + toplam + " TL");
            }
            else if (yas>=12 && yas<=24){
                switch (yolculukTipi) {
                    case 1 -> {
                        toplam = mesafe * (0.1);
                        indirim = toplam * (0.1);
                        toplam -=indirim;
                        System.out.println("İndirim: " + indirim + " TL");
                    }
                    case 2 -> {
                        toplam = mesafe * (0.10);
                        indirim = toplam * (0.30);
                        toplam = toplam - indirim;
                        System.out.println("İndirim: " + indirim + " TL");
                    }
                }
                System.out.println("İndirimli Tutar: " + toplam + " TL");
            }
            else if (yas<12){
                switch (yolculukTipi) {
                    case 1 -> {
                        toplam = mesafe * (0.10);
                        indirim = toplam * (0.50);
                        toplam -= indirim;
                        System.out.println("İndirim: " + indirim + " TL");
                    }
                    case 2 -> {
                        toplam = mesafe * (0.10);
                        indirim = toplam * (0.70);
                        toplam = toplam - indirim;
                        System.out.println("İndirim: " + indirim + " TL");
                    }
                }
                System.out.println("İndirimli Tutar: " + toplam + " TL");
            }
        }
        else{
            System.out.println("Hata! Pozitif sayı giriniz");
        }
    }
}
