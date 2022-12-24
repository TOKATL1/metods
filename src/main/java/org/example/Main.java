package org.example;

public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 3, 5, 7, 2};
        int aranacak = 1;
        boolean varMİ = false;
        for (int sayi : sayilar) {

            if (sayi == aranacak) {


                varMİ = true;
                break;
            }


        }
        String mesaj = "";
        if (varMİ) {
            mesaj=("sayi mevcuttur : " + aranacak);
            mesajVer(mesaj);
        } else {
            mesajVer("sayi mevcut değil : " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {

        System.out.println(mesaj);
    }

}
