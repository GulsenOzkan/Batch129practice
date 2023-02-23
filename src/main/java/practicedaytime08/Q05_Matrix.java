package practicedaytime08;

import java.util.Scanner;

public class Q05_Matrix {
    public static void main(String[] args) {
        /*
             Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.
             Input: 10
             Output:
             1 0 0 1 1 0 0 0 1 1
             0 0 1 0 1 0 1 0 0 0
             0 1 0 1 0 0 0 0 0 1
             1 1 1 0 0 0 0 1 1 1
             1 1 0 1 1 1 0 1 0 0
             1 0 0 0 1 1 0 0 0 0
             0 0 1 0 0 0 0 1 1 1
             1 1 0 1 0 1 0 0 1 0
             0 0 1 0 0 0 0 1 1 0
             1 1 1 0 0 1 1 1 1 0
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz.");
        int satirSayisi = input.nextInt();

        for (int i = 0; i < satirSayisi; i++) {// Satir kontrolu
            for (int j = 0; j < satirSayisi; j++) {// Sutun kontrolu
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }


    }
}
