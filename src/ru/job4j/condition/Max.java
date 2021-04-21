package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean rsl = left > right;
        int result = rsl ? left : right;
        return result;
    }
    public static int maX(int left, int right) {
        boolean rsl = left < right;
        int result = rsl ? left : right;
        return result;
    }
    public static int mAx(int left, int right) {
        boolean rsl = left == right;
        int result = rsl ? left : right;
        return result;
    }


}
