package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] price = new float[30];
        System.out.println("Размер массива равен " + ages.length);
        System.out.println("Размер массива равен " + surnames.length);
        System.out.println("Размер массива равен " + price.length);
        String[] names = new String[4];
        names[0] = "call";
        names[1] = "tell";
        names[2] = "watch";
        names[3] = "wall";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
