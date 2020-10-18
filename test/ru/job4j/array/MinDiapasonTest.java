package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {-20, 3, 7, 15, 20},
                        2, 3
                ), is(7)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {10, 0, 3, -2},
                        1, 3
                ), is(-2)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {15, 1, 2, 7},
                        0, 2
                ), is(1)
        );
    }
}