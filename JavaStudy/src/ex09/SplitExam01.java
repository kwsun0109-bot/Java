package ex09;

public class SplitExam01 {
    static void main() {
        String board1 = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String board2 = " 번호 : , 제목 : , 내용 : , 성명 : ";

        String [] token1 = board1.split(",");
        String [] token2 = board2.split(",");

        for (int i=0; i<token1.length; i++) {
            System.out.println(token2[i] + token1[i]);
        }

        
    }
}
