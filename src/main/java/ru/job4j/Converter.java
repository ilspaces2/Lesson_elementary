package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.88f;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.13f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float rubleEuro = Converter.euroToRuble(2);
        System.out.println("2 euro are " + rubleEuro + " rubles.");
        float rubleDollar = Converter.dollarToRuble(2);
        System.out.println("2 dollar are " + rubleDollar + " rubles.");
        float dollarEuro = Converter.dollarToEuro(2);
        System.out.println("2 dollar are " + dollarEuro + " euro.");
        float euroDollar = Converter.euroToDollar(2);
        System.out.println("2 euro are " + euroDollar + " dollar.");

        float in = 140;
        float expected = 2;
        boolean passed = expected == Converter.rubleToEuro(in);
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float in1 = 140;
        float expected1 = 2.3333333f;
        boolean passed1 = expected1 == Converter.rubleToDollar(in1);
        System.out.println("140 rubles are 2.3333333 dollar. Test result : " + passed1);
        float in2 = 2;
        float expected2 = 140;
        boolean passed2 = expected2 == Converter.euroToRuble(in2);
        System.out.println("2 euro are 140 rubles. Test result : " + passed2);
        float in3 = 2;
        float expected3 = 120;
        boolean passed3 = expected3 == Converter.dollarToRuble(in3);
        System.out.println("2 dollar are 120 rubles. Test result : " + passed3);
        float in4 = 2;
        float expected4 = 1.76f;
        boolean passed4 = expected4 == Converter.dollarToEuro(in4);
        System.out.println("2 dollar are 1.76 euro. Test result : " + passed4);
        float in5 = 2;
        float expected5 = 2.26f;
        boolean passed5 = expected5 == Converter.euroToDollar(in5);
        System.out.println("2 euro are 2.26 dollar. Test result : " + passed5);
    }
}