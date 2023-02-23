package lambda;


import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        ciftVePozitifLamExYazdir(sayi); // 12 6 8
        System.out.println("\n ***********");
        ciftVePozitifMetRef(sayi); // 12 6 8
        System.out.println("\n ***********");
        kareYazdir(sayi); // 25 64 144 0 1 144 25 25 36 81 225 64
        System.out.println("\n ***********");
        kareTekrarsiz(sayi); // 25 64 144 0 1 36 81 225
        System.out.println("\n ***********");
        buyKucSirala(sayi); // 15 12 9 8 6 5 5 1 0 -5 -8 -12
        System.out.println("\n ***********");
        pozitifKupBirlerBas5(sayi); // 125 125 3375
        System.out.println("\n ***********");
        toplamMetRef(sayi); // Optional[36]
        System.out.println("\n ***********");
        toplamLambdaEx(sayi); // 36
        System.out.println("\n ***********");
        System.out.println(pozitifElmCarpimLamEx(sayi)); // 1944000
        System.out.println("\n ***********");
        System.out.println(ciftElKareKucBuySirListReturn(sayi)); // [0, 36, 64, 64, 144, 144]
        System.out.println("\n ***********");





    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0 && t > 0).
                forEach(t -> System.out.print(t + " "));
    }
    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMetRef(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(Utils::yazdir);
    }
//SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void kareYazdir(List<Integer> sayi) {
        /*
        sayi.
                stream().
                map(t -> t * t).
                forEach(Utils::yazdir);
    }

         */
        sayi.
                stream().
                map(Utils::kareBul).
                forEach(Utils::yazdir);
    }
//SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void kareTekrarsiz(List<Integer> sayi) {

        sayi.
                stream().
                map(Utils::kareBul).
                distinct().
                forEach(Utils::yazdir);
    }
//SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void buyKucSirala(List<Integer> sayi) {
        sayi.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::yazdir);
    }
// SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozitifKupBirlerBas5(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t > 0).
                map(t -> t * t * t).
                filter(t -> t % 10 == 5).
                forEach(Utils::yazdir);

    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void toplamMetRef(List<Integer> sayi) {
        Optional<Integer> sonuc =
                sayi.
                stream().
                reduce(Integer::sum);
        System.out.println(sonuc);

        // reduce methodu terminal method'dur. Terminal method'lardan sonra hicbir method kullanilamaz.

    }
// SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamLambdaEx(List<Integer> sayi) {
        int sonuc =
                sayi.
                        stream().
                        reduce(0, (a, b) -> a + b);
        System.out.println(sonuc);
    }
//SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın

    public static int pozitifElmCarpimLamEx(List<Integer> sayi){
        int sonuc =
                sayi.
                        stream().
                        filter(t -> t > 0).
                        reduce(1, (a, b) -> a * b);

        return sonuc;

    }
    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List<Integer> ciftElKareKucBuySirListReturn(List<Integer> sayi){
       List<Integer> sonuc = sayi.stream().filter(t -> t%2 == 0).map(t -> t * t).sorted().collect(Collectors.toList());
       return sonuc;
    }
}
