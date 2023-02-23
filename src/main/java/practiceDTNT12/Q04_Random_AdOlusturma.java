package practiceDTNT12;

public class Q04_Random_AdOlusturma {
    public static void main(String[] args) {

//Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

        String alfabe = "abcçdefgğhiıjklmnoöprsştuüvyzABCÇDEFGĞHİIJKLMNOÖPRSŞTUÜVYZ ";

        String isim = "Ali Can";
        String yeniIsim = "";

        int sayac = 0;

        for (int i = 0; i < isim.length(); i++) {

            while (true) {
                char rastgeleHarf = alfabe.charAt((int) (Math.random() * alfabe.length()));
                sayac++;
                if (isim.charAt(i) == rastgeleHarf) {
                    yeniIsim += rastgeleHarf;
                    System.out.println("yeniIsim = " + yeniIsim);
                    System.out.println("sayac = " + sayac);
                    break;
                }
            }
        }

        System.out.println("sayac = " + sayac);
    }

}
