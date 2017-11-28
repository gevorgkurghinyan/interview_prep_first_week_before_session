package com.gevkurg;

import java.util.List;


public class MaxSumContigousSubarray {
  public int maxSubArray(final List<Integer> a) {
    if (a == null || a.size() ==0) {
      return 0;
    }

    int s = a.size();
    int[] m = new int[s];
    m[0] = a.get(0);
    int max = m[0];

    for (int i = 1; i < s; ++i) {
      m[i] = m[i-1] > 0 ? m[i-1] + a.get(i) : a.get(i);
      max = Math.max(max, m[i]);
    }

    return max;
  }
}
