package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class ContainsTest {

    @Test
    public void testContains() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};

       for (String s : array) {
           //System.out.println("In class ContainsTest, s has a value of -->"+s);

            boolean outcome = StringArrayUtils.contains(array, s);
            Assert.assertTrue(outcome);
        }

    }


}
