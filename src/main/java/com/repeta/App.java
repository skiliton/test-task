package com.repeta;

import static com.repeta.Task1.addTwoDigits;
import static com.repeta.Task2.largestNumber;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("addTwoDigits invocations");
        System.out.println(addTwoDigits(10));
        System.out.println(addTwoDigits(29));
        System.out.println(addTwoDigits(48));
        System.out.println(addTwoDigits(99));

        System.out.println("\nlargestNumber invocations");
        System.out.println(largestNumber(1));
        System.out.println(largestNumber(2));
        System.out.println(largestNumber(9));
    }
}
