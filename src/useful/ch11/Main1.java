package useful.ch11;

public class Main1 {

    public static void main(String[] args) {
        // 10 만원
        BankAccount bankAccount = new BankAccount();

        // 입금 일 위임 --> 1만원 임금
        Father father = new Father(bankAccount);
        father.start();
        // 출금 일 위임 --> 5천원 출금
        Mother mother = new Mother(bankAccount);
        mother.start();
        // 기대값 : 10만5천원 ... 정상 동작
        // 11000만원 --> 의도 하지 않은 동작이 발생 됨.

        // 위 해결 방안은 자바에서 동기화 처리로 해결 할 수 있다.
        // 키워드 synchronized 사용, synchronized 메서드로 만들 수 있다.
    } // end of main
} // end of class
