package exercise.my.ch02;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("현재 시간: " + now); // Tue May 13 12:00:00 KST 2025

        Calendar cal = Calendar.getInstance();
        cal.set(2025, 4, 12); // 월은 0부터 시작! (5월 = 4)
        System.out.println("설정된 날짜: " + cal.getTime());
    }
}
