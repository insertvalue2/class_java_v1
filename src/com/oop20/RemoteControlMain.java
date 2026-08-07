package com.oop20;

public class RemoteControlMain {

    public static void main(String[] args) {
        // 인터페이스 타입으로 객체을 받을 수 있다.
        RemoteControl rc = new TV(); // (업캐스팅된 상태라고 볼 수 있다)
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();
        System.out.println("------------");
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

    } // end of main
} // end of class
