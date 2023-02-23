package practicedaytime10.overriding;

public class Q02_Kredi {
    public static void main(String[] args) {


        Emekli emekliHasanAmca = new Emekli();

        System.out.println(emekliHasanAmca.faizHesapla(100));

        Memur memur1 = new Memur();
        System.out.println(memur1.faizHesapla(200));

        Isci isci1 = new Isci();
        System.out.println(isci1.faizHesapla(125));


    }
}
