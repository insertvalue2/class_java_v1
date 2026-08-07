import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // [수행준거 3: 오류 식별 및 수정]
        while (true) {
            System.out.print("주문할 수량을 입력하세요: ");
            count = sc.nextInt();

            if (count > 0) {
                break; // 정상 입력 시 반복 종료
            } else {
                System.out.println("오류: 1잔 이상 주문해야 합니다.");
            }
        }

        // [수행준거 1, 2: 설계 확인 및 앱 작성]
        int unitPrice = 2500;
        int totalPrice = count * unitPrice;
        System.out.println("\n--- 주문 결과 ---");
        System.out.println("총 결제 금액: " + totalPrice + "원");

        // [이중 for문 활용]
        if (count >= 3) {
            System.out.println("3잔 이상 구매 서비스 스탬프 발급:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}