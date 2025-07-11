package org.example; // 디렉토리 구조 -> 필수

public class Main { // class 선언
    //메소드 실행
    //static이 있어야 메모리 올라가서 실행시킬 수 있다.
    public static void main(String[] args) { // 메소드

//        System.out.println("[연산자]");
//        op(); // 메소드 호출
//        System.out.println("[조건문]");
//        cond();
//        System.out.println("[반복문]");
//        loop();
        System.out.println("[배열]");
        arrayTest();

    }
    //연산자 함수
    //메소드 : 행위를 해주게 하는 것
    //접근자(접근을 허용할 건지 안할건지로 public/private 등) 반환형(메소드를 실행시키고 나서 나오는 결과값 void 등) 이름
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
//        if_cond();
        String str = if_cond(-1);
        System.out.println( str + " 입니다.");
        bar();

        System.out.println("- switch 문");
//        switch_cond();
        String dayStr = switch_cond(1);
        System.out.println(dayStr);
        bar();
    }

    //반복문 함수
    public static void loop(){
        System.out.println("- for 문");
        for_loop();
        bar();

        System.out.println("- while 문");
        while_loop();
        bar();

        System.out.println("- do-while 문");
        do_while_loop();
        bar();
    }

    //배열 함수
    public static void arrayTest(){

//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//        int e = 5;
//
//        // 배열 선언 및 초기화
//        // 1. 배열에 다섯개의 값을 넣는것
//        int[] numbers_1 = {a,b,c,d,e};
//
//        // 2. 빈 배열 선언하고 값 넣는 것
//        int[] numbers_2 = new int[5];
//        numbers_2[0] = 1;
//        numbers_2[1] = 2;
//        numbers_2[2] = 3;
//        numbers_2[3] = 4;
//
//        numbers_1[3] = 10;
//        System.out.println(numbers_1[3]);
//        System.out.println(numbers_2.length);

        int[] nums = {1,2,3,4,5};
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }

    //산술 연산자
    public static void arithmetic_op(){
        //변수 : 어떤걸 정의
         int a = 10;
         int b = 3;
//         System.out.println(a+b);
         System.out.println(add(a,b));
         System.out.println(a % b);

    }

    //산술 연산자용 추가 함수
    //여기는 반환형이 int
    public static int add(int a, int b){
        int sum = a+b; //a+b 더한값을 sum으로 저장
        return sum; // 합계 반환
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
    public static String if_cond(int a){
//        int num = 10;
        String str = "";
        if (a > 0) {
//            System.out.println("양수입니다.");
            str = "양수";
        } else if (a == 0) {
//            System.out.println("0입니다.");
            str = "0";
        } else {
//            System.out.println("음수입니다.");
            str = "음수";
        }
        return str; //문자열 반환
    }

    //switch 문
    //괄호 안에 들어가는게 인자
    public static String switch_cond(int day){
//        int day = 3;
        String str = "";
        switch (day) {
            case 1:
//                System.out.println("월요일");
                str = "월요일";
                break;
            case 2:
//                System.out.println("화요일");
                str = "화요일";
                break;
            case 3:
//                System.out.println("수요일");
                str = "수요일";
                break;
            default:
//                System.out.println("기타 요일");
                str = "기타 요일";
                break;
        }
        return str;
    }

    //for 문
    public static void for_loop(){
        //초기값; 언제까지 진행해라; 연산방식
        for (int i = 3; i < 5; i++) {
            System.out.println(i);
        }
    }

    //while 문 : 초기값을 밖에다 설정하고 진행하는 것
    public static void while_loop(){
        int count = 3;
        while (count > 0) { //0보다 클 때까지 실행해라
            System.out.println(count);
            count--; // 계속 하나씩 빼가는 것
        }
    }

    //do-while 문 : 초기값을 주는것, while하고 비슷하나 최소 한 번은 실행됨
    public static void do_while_loop(){
        int num = 0;
        do {
            System.out.println(num);
            num++; // 계속 하나씩 증가
        } while (num < 3);
    }

    public static void bar(){
        System.out.println("==================================");
    }

}