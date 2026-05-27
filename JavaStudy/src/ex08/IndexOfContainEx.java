package ex08;

public class IndexOfContainEx {
    static void main() {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        String subString = subject.substring(location);
        System.out.println(subString);
        // 페이지 166~~
    }
}
