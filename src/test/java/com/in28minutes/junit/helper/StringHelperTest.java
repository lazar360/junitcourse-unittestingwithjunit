package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringHelperTest {

    @org.junit.Test
    public void truncateAInFirst2Positions() {
        StringHelper helper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = "CD";
        // AACD = > CD ACD => CD CDEF => CDEF CDAA => CDAA
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void areFirstAndLastTwoCharactersTheSame() {
        fail("Not yet implemented");
    }
}