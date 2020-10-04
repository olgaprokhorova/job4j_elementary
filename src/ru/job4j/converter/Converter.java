package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 10000;
        int expectedEuro = 142;
        int expectedDollar = 166;
        int outEuro = Converter.rubleToEuro(in);
        int outDollar = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("10000 rubles are 142 euro. Test result : " + passedEuro);
        System.out.println("10000 rubles are 166 dollar. Test result : " + passedDollar);

//        int euro = Converter.rubleToEuro(10000);
//        int dollar = Converter.rubleToDollar(10000);
//        System.out.println("10000 rubles are " + euro + " euro.");
//        System.out.println("10000 rubles are " + dollar + " dollar.");
    }
}
