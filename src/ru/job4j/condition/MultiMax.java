package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first > second) {
            result = first > third ? first : third;
        } else {
            result = second > third ? second : third;
        }
        return result;
    }
}
