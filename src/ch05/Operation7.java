package ch05;

/**
 * 빠른 평가란?
 * 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우
 * 두번째 조건을 평가하지 않는 것
 */
public class Operation7 {

    public static void main(String[] args) {

        int number = 5;
        int index = 0;

        // 논리곱(&&)을 사용한 빠른 평가
        // 첫번째 조건이 false 이기 때문에 논리곱에서 두번째 조건은 아예 평가되지 않음! <- 빠른 평가
        // boolean result = ( (number = number + 10) < 10 ) && ( (index = index + 2) < 10);
        boolean result = ( (number += 10) < 10 ) && ( (index += 2) < 10);
        System.out.println("number : " + number);
        System.out.println("index : " + index);
        System.out.println("논리곱 결과 확인 : " + result);

        System.out.println("----------------------------");

        // 논리합을 사용한 빠른 평가 확인
        // number 는 위에서 연산을 했기 때문에 현재 15 이다.
        // index 는 위에서 빠른평가로 진행 했기 때문에 현재 0이다.
        //                         25   <  10 -> F                    2   <  10 -> T
        //                                        F       ||    T -->  T
        // boolean result2 = ( (number = number + 10) < 10 ) ||  ( (index = index + 2) < 10);
        boolean result2 = ( (number += 10) > 10 ) ||  ( (index += 2) < 10);
        System.out.println("result2 : " + result2 );
        System.out.println("number : " + number);
        System.out.println("index : " + index);

        // 문제 1.
        // 빠른 평가 수식을 스스로 만들어 보고 결과를 확인하는 코드를 작성하세요


    } // end of main

} // end of class
