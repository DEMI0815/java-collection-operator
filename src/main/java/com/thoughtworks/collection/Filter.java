package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<>();

        for (Integer a : array) {
            if (a % 2 == 0) {
                list.add(a);
            }
        }

        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<>();

        for (Integer a : array) {
            if (a % 3 == 0) {
                list.add(a);
            }
        }

        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> list = new ArrayList<>();

        for (Integer aFirstList : firstList) {
            if (secondList.contains(aFirstList)) {
                list.add(aFirstList);
            }
        }

        return list;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> list = new ArrayList<>();

        for (Integer a : array) {
            if (!list.contains(a)) {
                list.add(a);
            }
        }

        return list;
    }
}