package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int mini = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    mini = j;
                }
            }
            if (i != mini) {
                int tmp = data[i];
                data[i] = data[mini];
                data[mini] = tmp;
            }
        }
        return data;
    }
}