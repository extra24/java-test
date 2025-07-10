package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("[연산자]");
        op();
        System.out.println("[조건문]");
        condition();



    }
    public static void bar(){
        System.out.println("==================================");
    }

    //연산자 함수
    public static void op(){
        System.out.println("- 산술 연산자");
        arithmetic_op();
        bar();

        System.out.println("- 대입 연산자");
        assignment_op();
        bar();

        System.out.println("- 비교 연산자");
        comparison_op();
        bar();

        System.out.println("- 논리 연산자");
        logical_op();
        bar();

        System.out.println("- 증감 연산자");
        increment_op();
        bar();

        System.out.println("- 조건(삼항) 연산자");
        conditional_op();
        bar();

        System.out.println("- 비트 연산자");
        bit_op();
        bar();
    }

    //조건문 함수
    public static void condition(){

    }

    //1. 산술 연산자
    public static void arithmetic_op(){
         int a = 10;
         int b = 3;
         System.out.println(a+b);
         System.out.println(a % b);
    }

    //2. 대입 연산자
    public static void assignment_op(){
        int x = 5;
        x += 3;
        System.out.println(x);
    }

    //3. 비교 연산자
    public static void comparison_op(){
        int num = 5;
        System.out.println(num == 5);
    }

    //4. 논리 연산자
    public static void logical_op(){
        boolean result = (5 > 3) && (10 > 5);
        System.out.println(result);
    }

    //5. 증감 연산자
    public static void increment_op(){
        int i = 1;
        i++;
        System.out.println(i);
    }

    //6. 조건(삼항) 연산자
    public static void conditional_op(){
        int score = 85;
        String grade = (score >= 90) ? "A" : "B";
        System.out.println(grade);
    }

    //7. 비트 연산자
    public static void bit_op(){
        int n = 5; // 0101
        int m = 3; // 0011
        System.out.println(n & m);  // 1 (0001) -> 같은 비트만 남긴다
    }


}