package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void wheP6K2Then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void wheP7p2K9Then2() {
        double expected = 1.16;
        double p = 7.2;
        int k = 9;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void wheP5p4K6p79Then2() {
        double expected = 0.81;
        double p = 5.4;
        double k = 6.79;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}