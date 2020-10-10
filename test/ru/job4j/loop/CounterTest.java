package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromMinus4To14ThenFifty() {
        int rsl = Counter.sumByEven(-4, 14);
        int expected = 50;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom1To1Then0() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}