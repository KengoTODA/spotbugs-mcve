package com.example;

import java.util.List;

public class MainTest {
  public static void main(String[] args) {
    doThingy(null);
  }

  public static void doThingy(List<String> myList) {
    myList.add("foo");
  }
}
