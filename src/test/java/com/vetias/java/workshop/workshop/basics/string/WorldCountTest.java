package com.vetias.java.workshop.workshop.basics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorldCountTest {

    @Test
    public void testWordCount() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This progra shows the count of the words");

        Assertions.assertEquals(12, count);
    }
}      
