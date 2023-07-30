package org.romkov.week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlmostEquivalentTest {

    @Test
    void areAlmostEquivalentMap() {

        AlmostEquivalent almostEquivalent = new AlmostEquivalent();
    List<String> s = Arrays.asList("aaaabbbbb");
    List<String> t = Arrays.asList("bbbaacccc");
    List<String> expected = Arrays.asList("NO");
    List<String> actual = AlmostEquivalent.areAlmostEquivalentMap(s,t);
        assertEquals(expected, actual);

    }

    @Test
    void areAlmostEquivalent() {

        AlmostEquivalent almostEquivalent = new AlmostEquivalent();
        List<String> s = Arrays.asList("aaaabbbbb");
        List<String> t = Arrays.asList("bbbaacccc");
        List<String> expected = Arrays.asList("NO");
        List<String> actual = AlmostEquivalent.areAlmostEquivalent(s,t);
        assertEquals(expected, actual);

    }











}