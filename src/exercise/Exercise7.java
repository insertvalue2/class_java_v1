package exercise;

public class Exercise7 {

    // 함수 만들기 1 - 인사말 출력하기
    static void greet(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    // 함수 만들기 2 - 제곱 계산하기
    static int square(int number) {
        return number * number;
    }

    // 함수 만들기 3 - 수의 부호 판별
    static String signOfNumber(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    // 함수 만들기 4 - 나이 확인
    static boolean checkAdult(int age) {
        return age >= 18;
    }

    // 함수 만들기 5 - 최대값 찾기
    static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 코드의 시작점 (메인 함수)
    public static void main(String[] args) {
        greet("홍길동");

        System.out.println("square(5) = " + square(5));
        System.out.println("square(-3) = " + square(-3));

        System.out.println("signOfNumber(1) = " + signOfNumber(1));
        System.out.println("signOfNumber(-1) = " + signOfNumber(-1));
        System.out.println("signOfNumber(0) = " + signOfNumber(0));

        System.out.println("checkAdult(20) = " + checkAdult(20));
        System.out.println("checkAdult(18) = " + checkAdult(18));
        System.out.println("checkAdult(17) = " + checkAdult(17));

        System.out.println("findMax(3, 7) = " + findMax(3, 7));
        System.out.println("findMax(10, 2) = " + findMax(10, 2));
        System.out.println("findMax(5, 5) = " + findMax(5, 5));
        System.out.println("findMax(-3, -8) = " + findMax(-3, -8));
    } // end of main

} // end of class