package org.example.week2;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypeGenericDemo<T extends Number> {
    List<Integer> integerList;
    List<Double> doubleList;
    public BoundedTypeGenericDemo(){
        integerList = new ArrayList<>();
        doubleList = new ArrayList<>();

        for(int integer = 1; integer < 30; integer +=5){
            integerList.add(integer);
        }
        for (int i=1; i < 35; i+=2){
            doubleList.add(i*0.5);
        }
    }

    public static void main(String[] args) {
        BoundedTypeGenericDemo<Integer> ObjectOne = new BoundedTypeGenericDemo<>();
    }
}
