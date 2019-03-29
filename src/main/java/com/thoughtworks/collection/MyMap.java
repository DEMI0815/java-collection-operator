package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> list = new ArrayList<>();

        for (Integer anArray : array) {
            list.add(anArray * 3);
        }
        return list;
    }

    public List<String> mapLetter() {
        List<String> list = new ArrayList<>();

        for (Integer anArray : array) {
            list.add(letterList.get(anArray - 1));
        }

        return list;
    }

    public List<String> mapLetters() {
        List<String> list = new ArrayList<>();

        for (Integer index : array) {
            if (index <= 26) {
                list.add(letterList.get(index - 1));
            }else {
                int first = index / 26;
                int second = index % 26;

                if (second == 0) {
                    second = 26;
                    first--;
                }

                String item = letterList.get(first - 1) + letterList.get(second - 1);
                list.add(item);
            }
        }

        return list;
    }

    public List<Integer> sortFromBig() {

        for(int i = 0; i < array.size(); i++){
            for(int j = i + 1; j < array.size(); j++){

                if (array.get(i) < array.get(j)){
                    Integer temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }

        return array;
    }

    public List<Integer> sortFromSmall() {

        for(int i = 0; i < array.size(); i++){
            for(int j = i + 1; j < array.size(); j++){

                if (array.get(i) > array.get(j)){
                    Integer temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }

        return array;
    }
}
