package com.oop1;

public class WarriorMainTest {

    // 코드 실행의 진입점(메인 함수) - JVM - Stack(메모리)
    public static void main(String[] args) {
        // new - 키워드, Warrior() <- 생성자 호출
        Warrior w1 = new Warrior();
        //Warrior w1;  // Warrior 변수 선언

        w1.name = "티모";
        w1.height = 10.5;
        w1.health = 100;
        w1.attackPower = 70;
        w1.defensePower = 30;

        // w1 참조 변수에 접근해서 값을 할당해 보자.
        // 객체의 접근은 . 연산자로 할 수 있다.
        System.out.println("w1 주소 값 : " + w1);
        System.out.println("w1 이름 : " + w1.name);
        System.out.println("w1 height : " + w1.height);
        System.out.println("w1 health : " + w1.health);
        System.out.println("w1 attackPower : " + w1.attackPower);
        System.out.println("w1 defensePower : " + w1.defensePower);

        System.out.println("-------------------------------");

        // Warrior 타입에 객체를 생성해서 해당 하는 상태 값을 입력하고
        // 화면에 출력하시오.
        Warrior w2 = new Warrior();
        // ...

    } // end of main

} // end of class
