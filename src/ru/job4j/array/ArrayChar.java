package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[0] != pref[0] || word[1] != pref[1]) {
                return false;
            }
        }
        return result;
    }
}