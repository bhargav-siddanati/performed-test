package com.bhargav.java.interview.tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class RetriveEmpFromDept {
    public static void main(String[] args){
        List<Employee> empList =  new ArrayList<>();
        empList.add(new Employee(21, "Bhargav", "IT", 50000));
        empList.add(new Employee(22, "Ravi", "HR", 60000));
        empList.add(new Employee(23, "Suresh", "IT", 55000));
        empList.add(new Employee(24, "Mahesh", "Finance", 70000));
        empList.add(new Employee(25, "Kiran", "HR", 62000));
        empList.add(new Employee(26, "Anil", "IT", 53000));
        empList.add(new Employee(29, "Vijay", "Finance", 72000));
        //System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::dept)));
        List<Employee> l = empList.stream().collect(Collectors.groupingBy(Employee::dept))
                .entrySet().stream()
                .map(x -> {
                    List<Employee> list = x.getValue();
                    if(list.size() == 1) return list.get(0);
                    return list.stream().sorted(Comparator.comparing(Employee::salary)).skip(1).findFirst().get();
                }).collect(Collectors.toList());
        l.stream().forEach(System.out::println);
    }
}

record Employee(int id, String name, String dept, int salary){}
