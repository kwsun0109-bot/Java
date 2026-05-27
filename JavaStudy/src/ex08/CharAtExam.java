package ex08;

public class CharAtExam {
    static void main() {

        String ssn = "9506241230123";
        char sx = ssn.charAt(6);
        switch (sx) {
            case '1', '3' :
                System.out.println("남자입니다.");
                break;

            case '2', '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
