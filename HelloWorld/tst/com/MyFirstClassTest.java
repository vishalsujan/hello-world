package com;

import com.oracle.tools.packager.Log;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vish on 4/25/17.
 */
class MyFirstClassTest {
    @BeforeEach
    void setUp() {
        System.out.print("Hello There!");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void myFirstMethod() {
    }

    @Test
    void mySecondMethod() {
    }

}