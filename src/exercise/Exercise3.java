package exercise;

public class Exercise3 {

    public static void main(String[] args) {
        // 할인된 가격을 화면에 출력하는 코드 작성
        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.30; // 30% 할인 // (0.7 사용 금지)
        // DISCOUNT_RATE 는 추후 변경될 수 있다 (변경 되더라도 코드를 동작 해야 한다)

        // 방식 1: 할인 금액을 먼저 구한 뒤 빼기
        double discountAmount = ORIGINAL_PRICE * DISCOUNT_RATE; // 깎이는 금액
        double finalPrice = ORIGINAL_PRICE - discountAmount;    // 최종 가격

        // 방식 2: 남는 비율(1 - 할인율)을 한 번에 곱하기
        // double finalPrice = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);

        // 할인된 계산 금액을 변수에 담아서 화면에 출력 (단 정수값으로 출력 하시오)
        System.out.println("할인된 가격: " + (int) finalPrice);

    } // end of main

} // end of class
