package practicedaytime06;

public class Q06_SimetrikArray {
    public static void main(String[] args) {

        // Bir Array'in simetrik olup olmadigini kontrol eden bir method olusturun.

        int[] arr = {1, 2, 3, 4, 6, 5, 4, 3, 2, 1};

        System.out.println(isSimetrik(arr));


    }

    public static boolean isSimetrik(int[] arr) {
        boolean isSimetrik = false;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                isSimetrik = true;

            } else {
                isSimetrik = false;
                break;
            }
        }
        return isSimetrik;
    }
}
