package practiceDTNT01;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

    /*
        Kullanicidan 0'dan buyuk pozitif bir tam sayi girimesini isteyin.
        Girilen sayi 3 basamakli ise ekrana "3 basamakli sayi" yazdirin.
        3 basamakli degilse cift olup olmadigini kontrou edin.
        Cift ise "3 basamakli olmayan cift sayi" yazdirin.
        Cift degilse "3 basamakli olmayan tek sayi" yazdirin.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("0'dan buyuk bir tam sayi giriniz");

        int sayi = input.nextInt();

        // IF() ILE COZUM


        boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasamakliOlmayanCift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;

        if (sayi > 0) {

            if (sifirdanBuyukUcBas) {
                System.out.println("3 basamakli sayi");
            } else if (sifirdanBuyukUcBasamakliOlmayanCift) {
                System.out.println("3 basamakli olmayan pozitif cift sayi");
            } else
                System.out.println("3 basamakli olmayan pozitif tek sayi");

        } else {// negatif sayilar icin burasi calisir
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        }

        // TERNARY ILE COZUM

        boolean sifirdanBuyukUcBasTer = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasamakliOlmayanCiftTer = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;

        // Sart     ?     True Action     :  False Action

        String sonuc = sayi > 0 ? sifirdanBuyukUcBasTer ? ("3 basamakli sayi") :
                sifirdanBuyukUcBasamakliOlmayanCiftTer ? ("3 basamakli olmayan pozitif cift sayi") :
                        ("3 basamakli olmayan pozitif tek sayi") :
                ("Lutfen pozitif bir tamsayi giriniz");
        System.out.println(sonuc);


    }
}
