package practiceDTNT07;

public class Q04_MethodOverLoading_Hacim {
    public static void main(String[] args) {

        //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir kod yaziniz.(Method overloading kullanınız)
        Hacim obje = new Hacim();
        int kupunHacmi = obje.hacimHesapla(5);
        System.out.println("kupunHacmi = " + kupunHacmi);

        int karePrizmaHacmi = obje.hacimHesapla(5, 4);
        System.out.println("Kare prizma'nin hacmi = " + karePrizmaHacmi);

        int dikdortgenPrizmaHacmi = obje.hacimHesapla(2, 3, 4);
        System.out.println("dikdortgenPrizmaHacmi = " + dikdortgenPrizmaHacmi);
    }
}
