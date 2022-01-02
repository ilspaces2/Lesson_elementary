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

    }
}