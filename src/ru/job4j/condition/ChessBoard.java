package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rls = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rls = Math.abs(x2 - x1);
        }
        return rls;
    }
}
