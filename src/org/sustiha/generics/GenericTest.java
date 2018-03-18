package org.sustiha.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sustihashreesampath on 12/19/16.
 */
public class GenericTest {

    public static void main(String [] args)
    {
        List<Integer> integers = Arrays.asList(1,2,3);
        System.out.println(sumOfList(integers));
        List<Double> doubles = Arrays.asList(1.2,2.1,3.0);
        System.out.println(sumOfList(doubles));

    }

    public static double sumOfList(List<? extends Number> numbers)
    {
        double s = 0.0;
        for (Number num: numbers
             ) {
            s+=num.doubleValue();
        }
        return s;
    }


}
