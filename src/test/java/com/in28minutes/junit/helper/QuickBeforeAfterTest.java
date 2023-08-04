package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickBeforeAfterTest {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void truncateAInFirst2Positions() {
//    }
//
//    @Test
//    public void areFirstAndLastTwoCharactersTheSame() {
//    }

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

}