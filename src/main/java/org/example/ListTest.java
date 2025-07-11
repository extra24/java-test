package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void listTest() {
        // 1부터 9까지 숫자를 list에 저장
        List<Integer> list_1 = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            list_1.add(i);
        }
        System.out.println(list_1);

        for(Integer item: list_1){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        listTest();

//        List<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("Hello");
//        list.add("World");
//        System.out.println(list);

//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }

//        for(String item: list){
//            System.out.println(item);
//        }
//
//        // Integer은  int를 담는것을 객체화 처리하는것.
//        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        System.out.println(intList);
//
//        // Double은 실수형
//        List<Double> doubleList = new ArrayList<>();
//        doubleList.add(3.14);
//        doubleList.add(2.71);
//        System.out.println(doubleList);
//
//        List<Animal> animalList = new ArrayList<>();
//        animalList.add(new Cat());
//        animalList.add(new Dog());
//        for (Animal animal : animalList) {
//            animal.sound();
//        }

    }
}
