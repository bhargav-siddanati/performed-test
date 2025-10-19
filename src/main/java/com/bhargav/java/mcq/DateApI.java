package com.bhargav.java.mcq;

import java.time.LocalDate;

public class DateApI {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2012, 2, 29);
        date.plusYears(2);
        System.out.println(date);
    }
}
