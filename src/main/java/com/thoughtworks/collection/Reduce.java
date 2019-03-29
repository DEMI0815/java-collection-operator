package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int maximum = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > maximum) {
                maximum = arrayList.get(i);
            }
        }

        return maximum;
    }

    public double getMinimum() {
        int minimum = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) < minimum) {
                minimum = arrayList.get(i);
            }
        }

        return minimum;
    }

    public double getAverage() {
        int sum = 0;

        for (Integer anArrayList : arrayList) {
            sum += anArrayList;
        }
        return (double) sum/arrayList.size();
    }

    public double getOrderedMedian() {
        double average;
        int index;

        if(arrayList.size()%2 != 0){
            index = arrayList.size()/2;
            average = arrayList.get(index);
        }else{
            index = arrayList.size()/2;
            average = ((double)(arrayList.get(index) + arrayList.get(index-1)))/2;
        }

        return average;
    }

    public int getFirstEven() {
        for (Integer anArrrayList : arrayList) {
            if (anArrrayList % 2 == 0) {
                return anArrrayList;
            }
        }

        return -1;
    }

    public int getIndexOfFirstEven() {
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0){
                return i;
            }
        }

        return -1;
    }

    public boolean isEqual(List<Integer> objectList) {

        if(objectList.size() != arrayList.size()){
            return false;
        }else{
            for(int i = 0; i < arrayList.size(); i++){

                if(!arrayList.get(i).equals(objectList.get(i))){
                    return false;
                }
            }
        }

        return true;
    }

    public double getMedianInLinkList(SingleLink<Integer> singleLink) {
        for (Integer anArrayList : arrayList) {
            singleLink.addTailPointer(anArrayList);
        }

        int index = arrayList.size()/2;

        if (arrayList.size() % 2 == 0) {
            return (singleLink.getNode(index) + singleLink.getNode(index + 1))/2.0;
        }else {
            return singleLink.getNode(index + 1);
        }
    }

    public int getLastOdd() {

        for(int i = arrayList.size() - 1; i >= 0; i--){
            if(arrayList.get(i) % 2 == 1){
                return arrayList.get(i);
            }
        }

        return -1;
    }

    public int getIndexOfLastOdd() {

        for(int i = arrayList.size() - 1; i >= 0; i--){
            if(arrayList.get(i) % 2 == 1){
                return i;
            }
        }

        return -1;
    }
}
