package com.oop5;

public class Subway {
    int lineNumber;  // 1, 2 호선
    int count;
    int money;

    // 1. 생성자
    public Subway(int line) {
        lineNumber = line;
    }
    // 2. 승객을 태운다
    void take(int pay) {
        money += pay;
        count ++;
    }

    // 3. 정보 보기
    void showInfo() {
        System.out.println("지하철 호선 : " + lineNumber);
        System.out.println("현재 승객 수 : " + count);
        System.out.println("현재 수익 금액 : " + money);
    }

}
