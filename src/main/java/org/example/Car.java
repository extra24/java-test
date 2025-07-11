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

    // 생성자 : 반환형이 없다. -> 기본으로 생성자는 자동으로 생성되어있다.
    // 가장 먼저 생성됨
    public Car(){
        // 기본 생성자
        System.out.println("자동차 객체가 생성되었습니다.");
    }

    //속성들을 받아내는 생성자 -> 이걸 가져와서 아래에서 사용할 수 있다.
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //변수를 일부만 넣어서 만들 수 있는 생성자도 있다.
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    //객체
    public static void main(String[] args){
//        Car myCar = new Car(); // 객체 만들기
        Car myCar = new Car("현대", "k9", 2012);
//        myCar.setBrand("기아"); //여기서 brand 값을 넣는다.
//        myCar.setModel("K9"); // 값 생성(데이터 삽입)
//        myCar.setYear(2012);

        System.out.println("브랜드 : "+ myCar.getBrand());
        System.out.println("모델 : "+ myCar.getModel());
        System.out.println("연식 : "+ myCar.getYear());

        myCar.move();
        myCar.stop();
    }

}
