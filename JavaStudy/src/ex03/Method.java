package ex03;

public class Method {
    public static void main(String[] args) {

        Calculate c = new Calculate();
        int result = c.add(1, 1);
        System.out.println(result);

        float result1 = c.divide(3, 0);
        System.out.println(result1);
    }
}

class Calculate {
    int add(int a, int b) { // 메서드 내부에 선언된 변수는 (int a, int b) --> 매개변수(지역변수)
        return a + b;       // 만약 int void add(..) 이면 반환타입이 없어 return문 없어도 된다
    }

    float divide(int a, int b) {
        if (b == 0) {
            System.out.println("'0'으로 나눌 수 없습니다.");
            return 0;
        }
        return a / (float)b;
    }
}
