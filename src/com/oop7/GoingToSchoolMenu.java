package com.oop7;

import java.util.Scanner;

// 코드를 실행해 보는 측
public class GoingToSchoolMenu {

    public static void main(String[] args) {

        // 준비물
        Scanner sc = new Scanner(System.in);
        final int EAT = 1;
        final int BUS = 2;
        final int SUBWAY = 3;
        final int MY_INFO = 4;
        final int END = 0;

        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        // 객체 생성 (등장 인물 준비)
        Student student = new Student(name, 5_000);
        //Rice rice = new Rice("김치볶음밥", 3000);
        Bus bus133 = new Bus(133, 1_000);
        //Subway line1 = new Subway(1, 1_400);

        while (true) {
            System.out.println();
            System.out.println("메뉴 선택");
            System.out.println("1. 밥먹기 2.버스타기 3.지하철타기 4.내상태 5.종료");
            // 직접 실행 흐름 만들어 보기
            int selected = sc.nextInt();
            if(selected == BUS) {
                student.takeBus(bus133);
            } else if( selected == MY_INFO) {
                student.showInfo();
            }
        }
    } // end of main

} // end of class
