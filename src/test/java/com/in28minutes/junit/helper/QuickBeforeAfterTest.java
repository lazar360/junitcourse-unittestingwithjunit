package com.in28minutes.junit.helper;

import org.junit.*;

import static org.junit.Assert.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Before
    public void setup(){
        System.out.println("Before Test");
    }

    @Test
    public void test1() {
        System.out.println("test 1 executed");
    }
    @Test
    public void test2() {
        System.out.println("test 2 executed");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
}