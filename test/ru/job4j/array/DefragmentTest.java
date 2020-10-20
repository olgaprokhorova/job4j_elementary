package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] expect = {"I", null};
        String[] result = Defragment.compress(input);
        assertThat(result, is(expect));
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        String[] result = Defragment.compress(input);
        assertThat(result, is(expect));
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        String[] result = Defragment.compress(input);
        assertThat(result, is(expect));
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] expect = {null, null, null};
        String[] result = Defragment.compress(input);
        assertThat(result, is(expect));
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] expect = {"I", "wanna", "be", "compressed", null, null, null};
        String[] result = Defragment.compress(input);
        assertThat(result, is(expect));
    }
}