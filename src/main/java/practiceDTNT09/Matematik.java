package practiceDTNT09;

public class Matematik {

    public double carpma(double... x) {
        double sonuc = 1;

        for (double w : x) {
            sonuc *= w;
        }
        return sonuc;
    }

    public double karesiniAl(double x) {
        return x * x;
    }
}