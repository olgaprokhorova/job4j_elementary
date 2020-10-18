package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort5() {
        int[] input = {1, 3, 5, 4, 2};
        int[] expect = {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = {8, -2, 4};
        int[] expect = {-2, 4, 8};
        int[] result = SortSelected.sort(input);
        assertThat(result, is(expect));
    }
}