package practiceDTNT04.practiceDTNT10;

public class Q01_Recursive_100den1e {
    public static void main(String[] args) {

        // 100'den 1'e kadar sayilari loop ve sayi kullanmadan yazdiran bir method olusturunuz.

        sayilariYazdir('d');


    }

    public static void sayilariYazdir(char ch) {

        if (ch >= 'a' / 'a') {
            System.out.print((int) ch + " ");
            ch--;
            sayilariYazdir(ch);
        }
    }
}
