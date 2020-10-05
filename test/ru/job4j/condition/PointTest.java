package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when1Minus3To65Then9() {
        double expected = 9.43;
        int x1 = 1;
        int y1 = -3;
        int x2 = 6;
        int y2 = 5;
        double out = Point.distance(1, -3, 6, 5);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when28To03Then5() {
        double expected = 5.385;
        int x1 = 2;
        int y1 = 8;
        int x2 = 0;
        int y2 = 3;
        double out = Point.distance(2, 8, 0, 3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05ToMinus55Then5() {
        double expected = 5;
        int x1 = 0;
        int y1 = 5;
        int x2 = -5;
        int y2 = 5;
        double out = Point.distance(0, 5, -5, 5);
        Assert.assertEquals(expected, out, 0.01);
    }
}