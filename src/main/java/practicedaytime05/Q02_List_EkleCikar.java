package practicedaytime05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    public static void main(String[] args) {

        //Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
        // list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        List<Integer> list = new ArrayList<>();


        while (true) {
            System.out.println("Ekleme yapmak icin : 'add'\n" +
                    "Guncellemek icin: 'set'\n" +
                    "Silmek icin: 'remove'\n" +
                    "Cikmak icin 'break' komutunu giriniz.");
            String komut = input.next();

            if (komut.equalsIgnoreCase("add")) {
                System.out.println("Eklemek istediginiz tamsayiyi giriniz");
                int eklenecekSayi = input.nextInt();
                list.add(eklenecekSayi);
            } else if (komut.equalsIgnoreCase("set")) {
                System.out.println("Guncellemek istediginiz sayiyi giriniz");
                Integer guncellenecekSayi = input.nextInt();
                int guncellenecekIndex = list.indexOf(guncellenecekSayi);
                System.out.println("Yerine eklemek istediginiz sayiyi giriniz");
                int yeniSayi = input.nextInt();
                list.set(guncellenecekIndex, yeniSayi);
            } else if (komut.equalsIgnoreCase("remove")) {
                System.out.println("Silmek istediginiz sayiyi giriniz");
                Integer silinecekSayi = input.nextInt();
                list.remove(silinecekSayi);
            } else if (komut.equalsIgnoreCase("break")) {
                break;
            } else {
                System.out.println("Gecerli bir komut giriniz");
            }
            System.out.println(list);


        }


    }
}
