package practicedaytime13;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_KursaOgrenciSec {
    public static void main(String[] args) {

        /*
             Spor kursu için seçilecek öğrencileri belirleyen bir kod yazınız.
             kurs gereklilikleri:
             erkekler: boy: 1.60 ve üstü
                       kilo:70-90 kg
             kızlar: boy: 1.50 ve üstü
                     kilo:50-70 kg
             kullanıcıdan öğrenci sayısı ve herbir öğrenci
             için isim , cinsiyet, kilo ve boy bilgilerini girmesini
             isteyiniz.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ogrenci sayisini giriniz");

        int ogrenciSayisi = scanner.nextInt();

        String[] isimArr = new String[ogrenciSayisi];
        String[] cinsiyetArr = new String[ogrenciSayisi];
        double[] kiloArr = new double[ogrenciSayisi];
        double[] boyArr = new double[ogrenciSayisi];

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println("Isim giriniz: ");
            scanner.nextLine();
            isimArr[i] = scanner.nextLine();
            System.out.println("Cinsiyeti giriniz: ");
            String cinsiyet = scanner.next().toLowerCase().trim().substring(0, 1);

            if (cinsiyet.equals("k") || cinsiyet.equals("e")) {
                cinsiyetArr[i] = cinsiyet;
            } else {
                System.out.println("Hatali giris. Yeniden giriniz.");
                i--;
                continue;
            }
            System.out.println("Kilo giriniz(kg): ");
            kiloArr[i] = scanner.nextDouble();

            System.out.println("Boy giriniz(m): ");
            kiloArr[i] = scanner.nextDouble();


        }
        System.out.println(Arrays.toString(isimArr));
        System.out.println(Arrays.toString(cinsiyetArr));
        System.out.println(Arrays.toString(kiloArr));
        System.out.println(Arrays.toString(boyArr));

        System.out.println("Kursa secilen ogrenciler");

        int sayac = 0;

        for (int i = 0; i < ogrenciSayisi; i++) {
            if (cinsiyetArr[i].equals("k") && kiloArr[i] >= 50 && kiloArr[i] <= 70 && boyArr[i] >= 1.5) {
                System.out.println(isimArr[i]);
                sayac++;
            } else if (cinsiyetArr[i].equals("e") && kiloArr[i] >= 70 && kiloArr[i] <= 90 && boyArr[i] >= 1.6) {
                System.out.println(isimArr[i]);
            }
        }
        if (sayac == 0) {
            System.out.println("Kursa secilen ogrenci yoktur!!!");
        }

// ODEV : Exception ve secilemeyen ogrenci isimleri
    }
}
