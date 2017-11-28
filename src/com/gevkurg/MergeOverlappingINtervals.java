package com.gevkurg;

import java.util.ArrayList;
import java.util.Comparator;


public class MergeOverlappingINtervals {
  public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    if (intervals == null) {
      throw new IllegalArgumentException("intervals");
    }

    ArrayList<Interval> list = new ArrayList<>();

    if (intervals.size() == 0) {
      return list;
    }

    intervals.sort(Comparator.comparingInt(x -> x.start));
    Interval current = null;

    for (Interval interval : intervals) {
      if (current == null) {
        current = interval;
      } else {
        if (interval.start <= current.end) {
          current.end = Math.max(current.end, interval.end);
        } else {
          list.add(current);
          current = interval;
        }
      }
    }

    list.add(current);

    return list;
  }

  class Interval {
    int start;
    int end;

    Interval() {
      start = 0;
      end = 0;
    }

    Interval(int s, int e) {
      start = s;
      end = e;
    }
  }
}
