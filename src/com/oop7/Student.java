package com.oop7;

public class Student {

    private String name;
    private int money;

    public Student(String n, int m) {
        name = n;
        money = m;
    }

    // 1. 버스 타다
    public void takeBus(Bus bus) {
        if(money < bus.pay) {
            System.out.println("버스를 탑승 못합니다");
        } else {
            money -= bus.pay;
            bus.take(bus.pay);
        }
    }
    // 2. 지하철 타다
    // 3. 밥을 먹다

    // 4. 내 정보 표시
    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("소지금 : " +  money);
    }
}
