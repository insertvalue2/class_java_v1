package ch08;

public class BreakTest2 {

    public static void main(String[] args) {

        // 문제 1. 1부터 100까지 반복문 진행
        //     2. 3의 배수만 화면에 출력하시오
        //     3. 50이상이면 반복문을 종료 시키세요
        //     4. for 구문으로 코드 작성
        for (int i = 1; i <= 100; i++) {
            // 50이상이면 반복문 종료 (break)
            if( i >= 50) {
                break;
            }
            // 3의 배수일 때만 출력
            if( i % 3 == 0) {
                System.out.println("i의 값 : " + i);
            }
        } // end of for

    } // end of main
} // end of class
