package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("[연산자]");
        op();
        System.out.println("[조건문]");
        cond();



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
    public static void cond(){
        System.out.println("- if 문");
        if_cond();
        bar();

        System.out.println("- switch 문");
        switch_cond();
        bar();
    }

    //산술 연산자
    public static void arithmetic_op(){
         int a = 10;
         int b = 3;
         System.out.println(a+b);
         System.out.println(a % b);
    }

    //대입 연산자
    public static void assignment_op(){
        int x = 5;
        x += 3;
        System.out.println(x);
    }

    //비교 연산자
    public static void comparison_op(){
        int num = 5;
        System.out.println(num == 5);
    }

    //논리 연산자
    public static void logical_op(){
        boolean result = (5 > 3) && (10 > 5);
        System.out.println(result);
    }

    //증감 연산자
    public static void increment_op(){
        int i = 1;
        i++;
        System.out.println(i);
    }

    //조건(삼항) 연산자
    public static void conditional_op(){
        int score = 85;
        String grade = (score >= 90) ? "A" : "B";
        System.out.println(grade);
    }

    //비트 연산자
    public static void bit_op(){
        int n = 5; // 0101
        int m = 3; // 0011
        System.out.println(n & m);  // 1 (0001) -> 같은 비트만 남긴다
    }

    //if 문
    public static void if_cond(){
        int num = 10;
        if (num > 0) {
            System.out.println("양수입니다.");
        } else if (num == 0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }
    }

    //switch 문
    public static void switch_cond(){
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
                break;
        }
    }


}