package practicedaytime13;

import java.util.HashMap;
import java.util.Map;

public class Q01_Map_AyniFiyat {
    public static void main(String[] args) {


        //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        System.out.println("urunler = " + urunler); // urunler = {Kemer=19.99, Kazak=24.99, Kravat=19.99, Ayakkabi=89.99, Terlik=29.99, Pijama=29.99, Gomlek=29.99}

        for (Map.Entry<String, Double> w : urunler.entrySet()) {
            if (w.getValue() == 29.99) {
                System.out.println(w.getKey() + " --> " + w.getValue()); // Terlik --> 29.99
                                                                         // Pijama --> 29.99
                                                                         // Gomlek --> 29.99


            }
        }


    }
}