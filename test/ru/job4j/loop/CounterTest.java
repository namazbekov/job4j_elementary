package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenSumEvenNumbersFrom1To6then() {
        int start = 1;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        Assert.assertEquals(expected, result);
    }
}