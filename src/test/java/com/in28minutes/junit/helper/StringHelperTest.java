package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

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

    // ABCD => false ABAB => true AB => true A => false
    @org.junit.Test
    public void testAreFirstAndLastTwoCharactersTheSame_FirstAndLastTwoCharactersDifferent() {
        // assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
    @org.junit.Test
    public void testAreFirstAndLastTwoCharactersTheSame_FirstAndLastTwoCharactersTheSame() {
        // assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
    @org.junit.Test
    public void testAreFirstAndLastTwoCharactersTheSame_OnlyTwoCharacters() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }
    @org.junit.Test
    public void testAreFirstAndLastTwoCharactersTheSame_OnlyOneCharacter() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }

}