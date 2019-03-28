package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int evenSum = 0;
        if(leftBorder < rightBorder) {
            for(int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 0) {
                    evenSum += i;
                }
            }
        } else {
            for(int i = rightBorder; i <= leftBorder; i++) {
                if (i % 2 = 0) {
                    evenSum += i;
                }
            }
        }
        return evenSum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int oddSum = 0;
        if(leftBorder < rightBorder) {
            for(int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 != 0) {
                    oddSum += i;
                }
            }
        } else {
            for(int i = rightBorder; i <= leftBorder; i++) {
                if (i % 2 != 0) {
                    oddSum += i;
                }
            }
        }
        return oddSum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer number : arrayList) {
            sum += (number * 3 + 2);
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> list = arrayList;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                list.set(i, arrayList.get(i) * 3 + 2);
            }
        }
        return list;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                sum += (arrayList.get(i) * 3 + 5);
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> resultList = this.returnEvenList(arrayList);

        double median;
        int size = resultList.size();
        if (size % 2 == 0) {
            median = (resultList.get(size / 2) + resultList.get(size / 2 - 1)) / 2;
        } else {
            median = resultList.get(size / 2);
        }

        return median;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        List<Integer> result = this.returnEvenList(arrayList);

        double sum = 0;
        for (Integer aResult : result) {
            sum += aResult;
        }

        return sum / result.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> result = this.returnEvenList(arrayList);

        for (Integer aResult : result) {
            if (aResult.equals(specialElment)) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List evenList = this.returnEvenList(arrayList);
        List result = new ArrayList<>();

        result.add(evenList.get(0));
        for (Object anEvenList : evenList) {
            if (!result.contains(anEvenList)) {
                result.add(anEvenList);
            }
        }

        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List evenList = this.returnEvenList(arrayList);
        List oddList = this.returnOddList(arrayList);

        for (int i = 0; i < evenList.size(); i++) {
            for (int j = 0; j < evenList.size(); j++) {
                if (evenList.get(i) < evenList.get(j)) {
                    int temp = evenList.get(i);
                    evenList.set(i, evenList.get(j));
                    evenList.set(j, temp);
                }
            }
        }

        for (int i = 0; i < oddList.size(); i++) {
            for (int j = 0; j < oddList.size(); j++) {
                if (oddList.get(i) > oddList.get(j)) {
                    int temp = oddList.get(i);
                    oddList.set(i, oddList.get(j));
                    oddList.set(j, temp);
                }
            }
        }

        List<Integer> result = evenList;
        for (Integer anOddList : oddList) {
            result.add(anOddList);
        }

        return result;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            Integer resultElement = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
            result.add(resultElement);
        }
        return result;
    }

    private List<Integer> returnEvenList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                result.add(arrayList.get(i));
            }
        }
        return result;
    }

    private List<Integer> returnOddList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                result.add(arrayList.get(i));
            }
        }
        return result;
    }
}
