package org.example;

public class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("새가 날아갑니다.");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
    }
}
