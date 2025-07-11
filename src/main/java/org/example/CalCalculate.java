package org.example;

public class CalCalculate {

    //덧셈
    public int add(int a, int b){
        int answer = a + b;
        return answer;
    }

    //뺄셈
    public int minus(int a, int b){
        int answer = a - b;
        return answer;
    }

    //나눗셈
    public double divide(int a, int b){
        double answer = a / b;
        return answer;
    }

    //곱셈
    public int multiplely(int a, int b){
        int answer = a * b;
        return answer;
    }

    //main
    public static void main(String[] args){
        CalCalculate myCalc = new CalCalculate();
        System.out.println(myCalc.add(6, 3));
        System.out.println(myCalc.minus(6, 3));
        System.out.println(myCalc.divide(6, 3));
        System.out.println(myCalc.multiplely(6, 3));
    }

    //feature 브랜치 넣고 PR에서 강사님 reviewer로 넣기
    //git commit -m "feat: 작업내용"
    //git push origin feature/calculate
}
