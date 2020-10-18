package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByTrueThenFalse() {
        boolean[] input = {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}