package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> list = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                list.add(i);
            }
        }else {
            for (int i = left; i >= right; i--) {
                list.add(i);
            }
        }

        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        List<Integer> list = new ArrayList<>();
        if (left < right){
            for (int i = left; i <= right; i++){
                if(i % 2 == 0){
                    list.add(i);
                }
            }
        }else{
            for (int i = left; i >= right; i--){
                if(i % 2 == 0){
                    list.add(i);
                }
            }
        }

        return list;
    }

    public List<Integer> popEvenElments(int[] array) {

        List<Integer> list = new ArrayList<>();

        for (int a : array){
            if(a % 2 == 0){
                list.add(a);
            }
        }

        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        List<Integer> list = new ArrayList<>();

        for (int first : firstArray) {
            for (int second : secondArray) {
                if (first == second) {
                    list.add(first);
                }
            }
        }

        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {

        List<Integer> list = new ArrayList<>();

        for (int first : firstArray) {
            list.add(first);
        }

        for (int second : secondArray) {
            if (!list.contains(second)) {
                list.add(second);
            }
        }

        return list
    }
}
