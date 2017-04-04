package com.example.mylibrary;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by tancho on 4/4/17.
 */
public class CalculatorTest {
    private Calculator underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new Calculator();

    }

    @Test
    public void add() throws Exception {
        assertThat(underTest.add(3, 3), is(6));
    }

}