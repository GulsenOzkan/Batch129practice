package practiceDTNT09;

import java.util.Scanner;

public class Q01_NestedLoop_AtbashCode {
    public static void main(String[] args) {
        /*
     Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
     Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
     Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
     Örn: A-->Z, B-->Y ...
     "abcdefghijklmnopqrstuvwxyz";
     "zyxwvutsrqponmlkjihgfedcba";
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime = input.nextLine();
        String alfabe = "abcdefghijklmnopqrstuvwxyz";

        // 1. YOL
        for (int i = 0; i < kelime.length(); i++) { // kelime indexi
            for (int j = 0; j < alfabe.length(); j++) { // alfabe indexi
                if (kelime.charAt(i) == alfabe.charAt(j)) {
                    System.out.print(alfabe.charAt(alfabe.length() - 1 - j));
                }
            }
        }

        // 2. YOL
        System.out.println("\n*********2. YOL*********");

        for (int i = 0; i < kelime.length(); i++) {

            int idx = 'z' - kelime.charAt(i);
            System.out.print((char) ('a' + idx));
        }


    }
}