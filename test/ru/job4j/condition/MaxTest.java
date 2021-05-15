package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        double first = 1;
        double second = 2;
        double result = Max.max(first, second);
        double expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        double result = Max.max(left, right);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 1;
        double result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }
}