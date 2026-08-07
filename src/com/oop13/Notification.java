package com.oop13;

public class Notification {

    // 1. 메시지만 보내는 메서드
    public void send(String message) {
        System.out.println("일반 알림: ["+ message +"]");
    }

    // 2. 메시지를 여러번 반복해서 보내는 메서드 (for) - 오버로딩
    public void send(String message, int count) {
        System.out.println("반복 알림 전송 ...");
        for(int i = 0; i < count; i++) {
            send(message);
        }
    }

    // 3. 받는 사람을 지정해서 보내는 메서드 - 오버로딩
    public void send(String receiver, String message) {
        System.out.println("["+ receiver +"]님에게 메시지: ["+ message +"]");
    }

    // 메인 함수 (테스트 코드 작성해보기)
    public static void main(String[] args) {

        Notification notification = new Notification();
        System.out.println("-------- 1번 호출 ---------");
        notification.send("내용");
        System.out.println("-------- 2번 호출 ---------");
        notification.send("졸면 안 돼요", 3); // 3번 반복
        System.out.println("-------- 3번 호출 ---------");
        notification.send("홍길동", "내용");

    } // end of main

} // end of main
