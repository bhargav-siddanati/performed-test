package com.bhargav.java.onlinetest;

public class CommonTest {
  public static void main(String[] args) {
    Parent p = new Child();

    System.out.println(p.a + "   " + p.b);
    System.out.println();
    System.out.println();
    p.m1();
    p.m2();
  }
}

class Parent {
  int a = 221;
  static int b = 222;

  Parent m1() {
    System.out.println("A - m1");
    return new Parent();
  }

  static void m2() {
    System.out.println("A - m2");
  }
}

class Child extends Parent {
  int a = 111;
  static int b = 112;

  Child m1() {
    System.out.println("B - m1");
    return new Child();
  }

  static void m2() {
    System.out.println("B - m2");
  }
}
