package ru.job4j.calculator;

import org.junit.Test;


import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 162;
        double expected = 59.8;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 1.01);

    }
}