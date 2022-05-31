package com.keyin.Word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordFindTest {

    @Test
   public void testWordTrueFalse() {
        String S1 = new String("Hello World");
        String S2 = new String("Goodbye World");

        Assertions.assertFalse(Boolean.parseBoolean(S1),S2);

        String S = new String("Jim");

        Assertions.assertNotNull(S);

        String R = new String("Deal");
        String T = new String("Deal");

        Assertions.assertTrue(R.equals(T), "True R and T are Equal");

    }

    @Test
    public void testWordEqual(){
        String S3 = new String("Roderick");
        String S4 = new String("Roderick");

        Assertions.assertEquals(S3,S4);

        String S5 = new String("Mother");
        String S6 = new String("Father");

        Assertions.assertNotEquals(S5,S6);
        Assertions.assertNotEquals(S3,S6);

    }
}
