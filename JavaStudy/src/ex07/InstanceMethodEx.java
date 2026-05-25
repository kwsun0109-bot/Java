package ex07;

public class InstanceMethodEx {
    public static void main(String[] args) {
    /* 클랫스 변수, 메서드가 인스턴스 변수, 메서드를 참조는 안된다
       오버로딩 : 과적하다 --> 같은이름의 메서드를 여러 개 작성하는 것
                 매개변수의 타입, 갯수로 구별한다.(이름이 같으나까.....)
                 반환타입은 관계없음...

       가변인자 선언부 : 매개변수의 맨 마지막에 와야한다.
       String concatenate (String ... str) {
            ...
       }

       System.out.println(concatenate());                        // 인자 없음
       System.out.println(concatenate("a"));                     // 인자가 하나
       System.out.println(concatenate("a", "b"));                // 인자가 둘
       System.out.println(concatenate(new String [] {"A", "B")); // 배열

       public PrintStream printf(String format, Object... args) {...}  <-- 맨 마지막에 와야함
    */

    }
}
