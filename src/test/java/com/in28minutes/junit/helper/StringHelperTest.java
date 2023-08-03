package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringHelperTest {
    StringHelper helper = new StringHelper();
    // AACD = > CD ACD => CD CDEF => CDEF CDAA => CDAA
    @org.junit.Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }
    @org.junit.Test
    public void testTruncateAInFirst2Positions2_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
    @org.junit.Test
    public void testTruncateAInFirst2Positions2_NoAinFirstPosition() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }
    @org.junit.Test
    public void testTruncateAInFirst2Positions2_Ain2LastPositions() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

//    @org.junit.Test
//    public void areFirstAndLastTwoCharactersTheSame() {
//        fail("Not yet implemented");
//    }
}