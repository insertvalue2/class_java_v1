package com.oop4;

public class CalculatorMain {

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a + b; // 입력받은 a와 b를 더해서 반환
    }

    // 두 숫자를 빼는 함수
    static int subtract(int a, int b) {
        return a - b; // a에서 b를 빼서 반환
    }
    // 두 숫자를 곱하는 함수
    static int multiply(int a, int b) {
        return a * b; // a와 b를 곱해서 반환
    }

    // 두 숫자를 나누는 함수
    static double divide(int a, int b) {
        // 방어적 코드
        if(b == 0) {
            System.out.println("0으로 나눌 수 없습니다");
            return 0;
        }
        // 정수 / 정수 ---> 정수 (소수점 버려짐)
        // (double) 둘 중 하나라도 실수 데이터 타입이어야 소수점을 반환 한다.
        return (double)a / b;
    }

    // 짝수 판별 함수
    static boolean isEven(int number) {
        return number % 2 == 0; // 나머지가 0이면 짝수
    }

    // 홀수 판별 함수
    static boolean isOdd(int number) {
        return number % 2 != 0; // 나머지가 0이 아니면 홀수
    }

    // 메인 함수
    public static void main(String[] args) {
        // 위 함수를 설계하고 테스트 코드 작성
        // 테스트용 숫자
        int num1 = 10;
        int num2 = 5;
        int testNumber = 7;

        // 만들어진 함수 테스트
    }

}

