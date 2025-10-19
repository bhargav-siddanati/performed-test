package com.bhargav.java.interview.optum;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataAnalyst {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,45,4,2,1};
        /* Find the frequency of element from the given array */
        Map<Integer,Long> map = Arrays.stream(arr).boxed().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        System.out.println(map);
        /*
            Student table, 10 rows. cloums: id, name, age, address
            2 rows having same name, age and adrees difference.
            result required 9 rows.
         */
    }
}
