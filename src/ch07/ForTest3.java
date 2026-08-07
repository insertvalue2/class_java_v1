package ch07;

public class ForTest3 {

    public static void main(String[] args) {

        // 1 부터 100까지 수 중  총합을 구하시오
        // 홀수 만 덧셈해서 구하는 총합을 담아주세요
        // 1 + 2 + 3 + 4 ... + 100;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // sum = sum + i;
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("sum : " + sum);
        // 반복문에 증감식을 2씩 증가 시켜보자.
        for (int i = 0; i < 10; i += 2) {
            System.out.println("2씩 증가 + " + i);
        }
        // 문제 - 화면에 10 9 8 7 6 5 4 3 2 1 을 출력하는 코드를 작성하시오.
        // for문 활용

    } // end of main

} // end of class
