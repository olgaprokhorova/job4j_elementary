package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        double expected = 1;
        int p = 4;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K5Then2() {
      double expected = 2.22;
      int p = 8;
      int k = 5;
      double out = SqArea.square(p, k);
      Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Then4() {
        double expected = 4;
        int p = 10;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}