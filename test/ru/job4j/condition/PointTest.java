package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when1Minus3To65Then9() {
        double expected = 9.43;
        Point a = new Point(1, -3);
        Point b = new Point(6, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when28To03Then5() {
        double expected = 5.385;
        Point a = new Point(2, 8);
        Point b = new Point(0, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05ToMinus55Then5() {
        double expected = 5;
        Point a = new Point(0, 5);
        Point b = new Point(-5, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}