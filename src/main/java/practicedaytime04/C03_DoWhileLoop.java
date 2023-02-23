package practicedaytime04;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

    /*
        INTERWIEW SORUSU :
    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
*/
        int numberOfBanans = 165;
        int survivalDays = 0;
        boolean monkeyLive = true;

        do {
            System.out.println("*************** maymunlar gunde 4 muz yer *******************");
            numberOfBanans -= 4; // toplam muz sayisindan her gun 4 muz eksiltir
            System.out.println("Kalan muz sayisi = " + numberOfBanans);
            survivalDays++;
            if (numberOfBanans < 4) {
                monkeyLive = false;
                System.out.println("Bugun" + survivalDays + ". gun yeterli muz kalmadi. Maymun rahmetli");
                System.out.println("Maymun " + survivalDays + ". gun oldu");
            } else {
                System.out.println("Bugun " + survivalDays + " .gun; maymun hala yasiyor ");
            }

        } while (monkeyLive);


    }
}
