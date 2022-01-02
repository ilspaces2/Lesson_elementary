package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when41to27then6() {
        double expected = 6.32;
        int x1 = 4;
        int y1 = 1;
        int x2 = 2;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to89then9() {
        double expected = 9.89;
        int x1 = 1;
        int y1 = 2;
        int x2 = 8;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when38to17then2() {
        double expected = 2.23;
        int x1 = 3;
        int y1 = 8;
        int x2 = 1;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}