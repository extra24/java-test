package org.example;

// 클래스 선언
public class Car {
    //변수 = 속성
    private String brand;
    private String model;
    private int year;

    //메소드 = 행위나 기능
    public void move(){
        System.out.println("자동차가 움직입니다.");
    }

    public void stop(){
        System.out.println("자동차가 멈춥니다.");
    }

    //변수 brand에 대해 인수로 값를 받아서 brand 변수에 저장하는것
    public void setBrand(String brand){
        //this라는게 위에 선언한 것을 의미함
        this.brand = brand;
    }

    //brand값을 조회
    public String getBrand(){
        return this.brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }



    //객체생성
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.setBrand("기아"); //여기서 brand 값을 넣는다.
        myCar.setModel("K9");
        myCar.setYear(5);
        System.out.println("브랜드 : "+ myCar.getBrand());
        System.out.println("모델 : "+ myCar.getModel());
        System.out.println("연식 : "+ myCar.getYear());

        myCar.move();
        myCar.stop();
    }

}
