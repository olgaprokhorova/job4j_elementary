package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(8, 3, 2);
        assertThat(result, is(8));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(2, 5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(7, -2, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenEqual() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}

