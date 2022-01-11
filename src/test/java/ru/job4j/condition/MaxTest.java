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
}