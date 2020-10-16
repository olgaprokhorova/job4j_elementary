package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectArray = {5, 4, 3, 2, 1};
        int[] resultArray = turner.back(inputArray);
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] expectArray = {6, 5, 4, 3, 2, 1};
        int[] resultArray = turner.back(inputArray);
        assertThat(resultArray, is(expectArray));
    }
}