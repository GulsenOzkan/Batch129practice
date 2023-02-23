package practicedaytime06;

public class Q05_Arrays_ToplamVeVeriler {
    public static void main(String[] args) {

        /*
            Toplamlari, verilen bir sayiya esit olan Array element ciftlerini yazdiran bir method olusturun

            {4,6,5,-10,8,5,20} ==> 10
            4+6=10
            5+5=10
            -1+20=10
         */
        int[] arr = {4, 6, 5, -10, 8, 5, 20};
        ikilileriBul(arr, 10);


    }

    public static void ikilileriBul(int[] arr, int toplam) {
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == toplam) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + toplam);

                }

            }
        }
        if (sayac == 0) {
            System.out.println("Toplama esit sayi ikilileri bulunmamaktadir");
        }
    }
}
