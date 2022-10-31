package Giris;

import java.util.Scanner;

public class proje10 {
    public static void main(String[] args) {
        int n1, n2, secim;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        n1 = input.nextInt();
        System.out.print("Bir sayı girin : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme  ");
        System.out.print("Seçiminiz : ");
        secim = input.nextInt();
        boolean sifir = n2 == 0;

        switch (secim) {
            case 1:
                System.out.println("Sonuç : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç : " + (n1 * n2));
                break;
            case 4:
                System.out.println(sifir ? "Bir sayı sıfıra bölünemez!" : "Sonuç : " + (n1 / n2));
                break;
            default:
                System.out.println("Geçerli bir işlem giriniz!");
        }
    }
}
