package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2, 1};
        int el = 5;
        int rez = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, rez);
    }

    @Test
    public void whenArrayHas10ThenMinus1() {
        int[] data = {5, 4, 3, 2, 1, 2, 6};
        int el = 10;
        int rez = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, rez);
    }
}