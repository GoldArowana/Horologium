package com.aries.time.jdk8;

import org.junit.Test;

import java.time.Year;

public class YearTest {
    @Test
    public void nowTest() {
        Year year = Year.now();
        System.out.println(year);
    }

    @Test
    public void n() {
        Year.isLeap(2019);
//        Year.from(;
        Year.of(1990).getValue();
        Year.parse();

    }
}
