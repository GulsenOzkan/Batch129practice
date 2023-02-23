package practiceDTNT03;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArraysKarakterleriSaydir {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Bir String giriniz :");
        String str = input.nextLine();  //alican
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));//[a, l, i, c, a, n]
        Arrays.sort(arr);
        System.out.println("sort methodundan sonra " + Arrays.toString(arr));
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;//Ayni olanlar icin 1 artir
            } else {
                System.out.println(arr[i - 1] + " karakterinin sayisi " + (counter + 1) + " kez tekrarlanmistir");
                counter = 0;//baska harfe gectigi icin sifirlanmali
            }
            if (i == arr.length - 1)//defalarca kodu yazdirmamasi icin sona gelindiginde yazdirmasi icin if kullandik
                System.out.println(arr[i] + "karakterinin sayisi " + (counter + 1) + " kez tekrarlanmistir");
        }
    }
}
