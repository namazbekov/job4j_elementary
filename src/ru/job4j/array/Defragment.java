package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index + 1;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != null) {
                        int notNullIndex = j - 1;
                        SwitchArray.swap(array, point, notNullIndex);
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}