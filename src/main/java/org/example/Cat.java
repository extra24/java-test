package org.example;

//Animal을 상속받음 : 상속은 부모클래스의 것을 다 가져다 쓸 수 있음 게다가 재정의해서 쓸 수 있다.
public class Cat extends Animal{

    //어노테이션 : 명시하고 싶을 때 사용
    //메서드 오버라이딩 : 부모 클래스의 메서드를 자식 클래스에서 재정의
    @Override
    void sound() {
        System.out.println("야옹");
    }

    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.sound(); //동물 소리 출력됨
    }
}
