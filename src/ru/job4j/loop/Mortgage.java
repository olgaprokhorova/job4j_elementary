package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += (double) amount / 100 * percent;
            year++;
            amount -= salary;
        }
    return year;
    }
}
