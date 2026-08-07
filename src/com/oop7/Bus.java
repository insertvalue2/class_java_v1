package com.oop7;

public class Bus {

    private int busNumber;
    int pay;

    public Bus(int n, int p) {
        busNumber = n;
        pay = p;
    }

    // true/false
    public boolean take(int money) {
        if(pay < money) {
            System.out.println("요금 부족 탑승 금지");
            return false;
        } else {
            System.out.println("탑승 완료");
            return true;
        }
    }
}
