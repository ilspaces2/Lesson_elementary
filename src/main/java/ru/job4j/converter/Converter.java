package ru.job4j.converter;

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
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
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
        in = 120;
        passed = expected == Converter.rubleToDollar(in);
        System.out.println("120 rubles are 2 dollar. Test result : " + passed);

        in = 2;
        expected = 140;
        passed = expected == Converter.euroToRuble(in);
        System.out.println("2 euro are 140 rubles. Test result : " + passed);

        expected = 120;
        passed = expected == Converter.dollarToRuble(in);
        System.out.println("2 dollar are 120 rubles. Test result : " + passed);

        expected = 1.76f;
        passed = expected == Converter.dollarToEuro(in);
        System.out.println("2 dollar are 1.76 euro. Test result : " + passed);

        expected = 2.26f;
        passed = expected == Converter.euroToDollar(in);
        System.out.println("2 euro are 2.26 dollar. Test result : " + passed);
    }
}