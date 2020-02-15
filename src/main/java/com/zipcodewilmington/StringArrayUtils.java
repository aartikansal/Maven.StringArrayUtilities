package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ //
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];


    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


        return array[array.length - 2];


    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i <= array.length - 1; i++) {
           // System.out.println(" in class StringArrayUtils the Array length is -->"+array.length);
            //System.out.println("in class StringArrayUtils Array is-->"+array[i]);
            //System.out.println("in class StringArrayUtils Value is-->"+value);
            //if (array.equals(value)) {

            //}
            System.out.println("I am here");
            return true;
        }
        System.out.println("I never come here");
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
    //convert string array to list of strings//
        List<String> input = Arrays.asList(array);
        //reverse the collections of string using Collections parent class of List
        Collections.reverse(input);
        //convert list back to array and return
        return input.toArray(array);

        /*String [] reverse = new String[array.length];
        System.out.println("array length   is:"+array.length);
        for (int start = 0, end = array.length -1; start < end; start++, end--)
        {

            String temp = array[end];
            System.out.println("temp  is -->"+temp);
            System.out.println("start   is -->"+start +" --- And end  is -->"+end);
            reverse[start] = array[end];
            System.out.println("main array is  --> :"+array[end]+"  And reverse is  --> :"+reverse[start]);
            System.out.println("reverse string is  --> :"+Arrays.toString(reverse));
        }
        //System.out.println("main string is  --> :"+Arrays.toString(array));
        //System.out.println("reverse string is  --> :"+Arrays.toString(reverse));

        return reverse;*/
    }



        /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
   // public static boolean isPalindromic (String[] array){
            //return null;
        //}



    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

        if (array[i] == value) {
            counter = counter + 1;
        }
     }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove)
    {

       String result = "";
        System.out.println("Value to remove is -->"+valueToRemove);
        for (int i = 0; i < array.length; i++)
        {

            if (array[i].equals(valueToRemove))
            { System.out.println("in IF the value  to remove is -->"+valueToRemove);
            //array[i] = null;
                result=array[i];
            break;
            }
        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates (String[] array) {
       /* int index = 0;
        String temp = array[0];
        String tempString = temp;
        String[] strArray = new String[array.length];
        index++;
        //Assert.assertTrue(outcome);

        int i=0;
        String[] finalArray =new String[0];
                for(i =1; i<array.length;i++){
                    if(array[i].equals(temp)) {
                    }else {
                        strArray[index] = tempString;
                        temp = array;
                        tempString =temp;
                        index++;
                    }
                    strArray[index] = tempString;
                    finalArray = new String[index +1];
                    for(int j= 0; j<index+1; j++) {
                        finalArray[j]= strArray[j];
                    }
                }
        return finalArray;*/
       return null;
        }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
