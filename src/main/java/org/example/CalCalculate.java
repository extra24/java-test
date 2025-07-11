package org.example;

public class CalCalculate {

    //git commit -m "feat: 작업내용"
    //git push origin feature/calculate

    //git hub 화면에서 Pull Request 생성
    //feature/calculate 브랜치 넣고 PR에서 강사님 reviewer로 넣기

    //리뷰가 끝나면 merge 버튼 누르기

    private int a;
    private int b;

    //덧셈
    public int add(int a, int b){
        return a + b;
    }

    //뺄셈
    public int minus(int a, int b){
        return a - b;
    }

    //나눗셈
    public double divide(int a, int b){
        return (double) a / b;
    }

    //곱셈
    public int multiply(int a, int b){
        return a * b;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    //main
    public static void main(String[] args){
        CalCalculate myCalc = new CalCalculate();
        myCalc.setA(6);
        myCalc.setB(3);

        System.out.println("덧셈 : " + myCalc.add(myCalc.getA(), myCalc.getB()));
        System.out.println("뺄셈 : " + myCalc.minus(myCalc.getA(), myCalc.getB()));
        System.out.println("나눗셈 : " + myCalc.divide(myCalc.getA(), myCalc.getB()));
        System.out.println("곱셈 : " + myCalc.multiply(myCalc.getA(), myCalc.getB()));
    }
}
