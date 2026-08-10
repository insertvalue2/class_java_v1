package useful.ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordBook {

    public static void main(String[] args) {

        // apple, -> 사과
        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        words.put("apple", "사과");
        words.put("banana", "바나나");
        words.put("cherry", "체리");

        while (true) {
            System.out.println("\n===영한 단어장===");
            System.out.println("1. 단어 추가 2. 단어 검색 3. 전체 출력  4. 종료");
            System.out.print("선택 : " );
            String choice = sc.nextLine();
            // 아래 기능을 구현해주세요 (if, switch) 둘 중 하나 선택 가능
        }








        // 자원 닫기
        // sc.close();
    }
}
