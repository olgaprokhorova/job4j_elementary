package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2To6() {
        int[] input = {1, 3, 13, 7, 9, 11, 5, 15};
        int[] expect = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] rsl = SwitchArray.swap(input, 2, 6);
        assertThat(rsl, is(expect));

    }

    @Test
    public void whenSwap3To4() {
        int[] input = {10, 10, 20, 30, 20, 30};
        int[] expect = {10, 10, 20, 20, 30, 30};
        int[] rsl = SwitchArray.swap(input, 3, 4);
        assertThat(rsl, is(expect));
    }
}