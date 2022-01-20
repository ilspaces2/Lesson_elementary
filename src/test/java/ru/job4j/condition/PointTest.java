package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when41to27then6dot32() {
        double expected = 6.32;
        Point a = new Point(4, 1);
        Point b = new Point(2, 7);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to89then9dot89() {
        double expected = 9.89;
        Point a = new Point(1, 2);
        Point b = new Point(8, 9);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when38to17then2dot23() {
        double expected = 2.23;
        Point a = new Point(3, 8);
        Point b = new Point(1, 7);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}