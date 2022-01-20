package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax3To6Then6() {
        int left = 3;
        int right = 6;
        int expected = 6;
        int rezult = Max.max(left, right);
        Assert.assertEquals(expected, rezult);
    }

    @Test
    public void whenMax10To6Then10() {
        int left = 10;
        int right = 6;
        int expected = 10;
        int rezult = Max.max(left, right);
        Assert.assertEquals(expected, rezult);
    }

    @Test
    public void whenMax20To20Then20() {
        int left = 20;
        int right = 20;
        int expected = 20;
        int rezult = Max.max(left, right);
        Assert.assertEquals(expected, rezult);
    }

    @Test
    public void whenMax30To3To49Then49() {
        int one = 30;
        int two = 3;
        int three = 49;
        int expected = 49;
        int rezult = Max.max(one, two, three);
        Assert.assertEquals(expected, rezult);
    }

    @Test
    public void whenMax90To3To49Then90() {
        int one = 90;
        int two = 3;
        int three = 49;
        int expected = 90;
        int rezult = Max.max(one, two, three);
        Assert.assertEquals(expected, rezult);
    }

    @Test
    public void whenMax90To3To49To18Then90() {
        int one = 90;
        int two = 3;
        int three = 49;
        int four = 18;
        int expected = 90;
        int rezult = Max.max(one, two, three, four);
        Assert.assertEquals(expected, rezult);
    }

    @Test
    public void whenMax0To1To49To18Then49() {
        int one = 0;
        int two = 1;
        int three = 49;
        int four = 18;
        int expected = 49;
        int rezult = Max.max(one, two, three, four);
        Assert.assertEquals(expected, rezult);
    }
}