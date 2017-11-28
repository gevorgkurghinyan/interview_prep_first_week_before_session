package com.gevkurg;

public class StrStr {
  public int strStr(final String haystack, final String needle) {
    if (needle == "" && haystack == "") {
      return -1;
    }

    if (needle == "") {
      return -1;
    }

    int n = haystack.length();
    int m = needle.length();

    if (m > n) {
      return -1;
    }

    for(int i = 0; i <= n - m; ++i) {
      for(int j = 0; j < m && haystack.charAt(i+j) == needle.charAt(j); ++j){
        if (j == m - 1) {
          return i;
        }
      }
    }

    return -1;
  }
}
