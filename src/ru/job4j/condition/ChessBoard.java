package ru.job4j.condition;
public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {

        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y1 -y2)) {
            if (x1 >= 0 && x1 <= 7 && x2 >= 0 && x2 <= 7 && y1 >= 0 && y1 <= 7 && y2 >= 0 && y2 <= 7) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(-1,6,4,1));
    }
}