package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;
        for (int i = 0, j = 0; i < left.length || j < right.length;) {
            if (i < left.length && j < right.length) {
                result[count] = left[i] < right[j] ? left[i++] : right[j++];
            } else if (i < left.length) {
                result[count] = left[i++];
            } else if (j < right.length) {
                result[count] = right[j++];
            }
            count++;
        }
        return result;
    }
}
