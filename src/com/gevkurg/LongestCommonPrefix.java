package com.gevkurg;

import java.util.ArrayList;


public class LongestCommonPrefix {
  public String longestCommonPrefix(ArrayList<String> a) {
    if (a == null || a.size() == 0) {
      return "";
    }

    String prefix = a.get(0);
    int i = 1;
    while (i < a.size()){
      while (a.get(i).indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
      }

      ++i;
    }

    return prefix;
  }
}
