package com.app.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import com.app.dev.Operations;

public class TestOperations {
    Operations obj;

    @Before
    public void setUp() {
        obj = new Operations();
    }

    @Test
    public void testSum() {
        assertEquals(8, obj.doSum(5, 3));
    }

    @Test
    public void testSumWithZero() {
        assertEquals(5, obj.doSum(5, 0));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-5, obj.doSum(-2, -3));
    }

    @After
    public void tearDown() {
        obj = null;
    }
}
