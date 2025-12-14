package com.bhargav.java;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestingTheClass {
    public static void main(String[] args){
        String str = "Nucleus";
        System.out.println(String.valueOf(Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))));
        for(int i=0; i<5; i++){
            if(i > 1) System.out.println((int) ' ');
        }
    }
}
