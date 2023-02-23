package practicedaytime10.overriding;

public class Isci extends Banka{


    @Override
    public double faizHesapla(double alinanakKredi) {
        return alinanakKredi*15/100;
    }
}
