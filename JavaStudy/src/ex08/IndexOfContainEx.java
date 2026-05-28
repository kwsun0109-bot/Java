package ex08;

public class IndexOfContainEx {
    static void main() {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        String subString = subject.substring(location);
        System.out.println(subString);

        try {
            int [] intArray = new int[5];
            intArray[0] = 10;

            String str = "여행";   
            System.out.println("총 문자 수 : " + str.length());
        } catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
