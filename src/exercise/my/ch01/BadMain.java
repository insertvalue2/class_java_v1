package exercise.my.ch01;

public class BadMain {
    public static void main(String[] args) {
        String menu1 = "아메리카노";
        int price1 = 4500;
        int quantity1 = 2;

        String menu2 = "카페라떼";
        int price2 = 5000;
        int quantity2 = 1;

        String menu3 = "딸기 스무디";
        int price3 = 6500;
        int quantity3 = 3;

        int total1 = price1 * quantity1;
        int total2 = price2 * quantity2;
        int total3 = price3 * quantity3;
        int sum = total1 + total2 + total3;

        System.out.println(menu1 + " " + price1 + "원 x " + quantity1 + "개 = " + total1 + "원");
        System.out.println(menu2 + " " + price2 + "원 x " + quantity2 + "개 = " + total2 + "원");
        System.out.println(menu3 + " " + price3 + "원 x " + quantity3 + "개 = " + total3 + "원");
        System.out.println("결제 금액 " + sum + "원");
    }
}
