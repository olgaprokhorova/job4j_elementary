package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert10000RblThen142Euro() {
        int in = 10000;
        int expected = 142;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void henConvert10000RblThen166Dlr() {
        int in = 10000;
        int expected = 166;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}