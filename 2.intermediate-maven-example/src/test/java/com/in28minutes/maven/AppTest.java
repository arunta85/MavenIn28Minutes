package com.in28minutes.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
        assertEquals(0, app.add(-2, 2));
        assertEquals(-7, app.add(-5, -2));
    }
}
