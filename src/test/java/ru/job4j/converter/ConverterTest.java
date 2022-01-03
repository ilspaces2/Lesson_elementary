package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RubTo2Euro() {
        float in = 140;
        float expected = 2;
        double out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RubTo2Dollar() {
        float in = 140;
        float expected = 2.3333333f;
        double out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2EuroTo140Rub() {
        float in = 2;
        float expected = 140;
        double out = Converter.euroToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2DollarTo120Rub() {
        float in = 2;
        float expected = 120;
        double out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2DollarTo1point76Euro() {
        float in = 2;
        float expected = 1.76f;
        double out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2EuroTo2point26Dollar() {
        float in = 2;
        float expected = 2.26f;
        double out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}