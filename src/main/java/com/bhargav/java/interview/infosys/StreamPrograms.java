package com.bhargav.java.interview.infosys;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPrograms {
    public static void main(String[] args) {
        /* A List contains a User objects. The user contains a list of phone numbers.
         * Fetch all user phonenumbers
         * */

        List<User> users = new ArrayList<>();
        users.add(new User("asd", 123, List.of("2342", "3425", "52345")));
        users.add(new User("wer", 345, List.of("5463", "5646", "6788")));
        users.add(new User("fdg", 466, List.of("78657")));
        users.add(new User("xcv", 768, List.of("672435", "867434")));

        List<String> collectList = users.stream()
                .flatMap(us -> us.getPhoneNumber().stream())
                .collect(Collectors.toList());
        System.out.println(collectList);

        long userId = users.stream().sorted(Comparator.comparing(User::getId).reversed())
                .skip(1)
                .findFirst().orElseThrow().getId();
        System.out.println(userId);

        List<String> fruits = List.of("manago" , "banana", "apple", "kiwi", "pappaya", "guava", "manago" , "banana", "apple");
        Map<String, Long> map = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}

class User {
    private String name;
    private long id;
    private List<String> phoneNumber;

    public User(String name, long id, List<String> phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }
}
