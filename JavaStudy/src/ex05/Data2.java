package ex05;
// 참조형 매개변수
class PrimitiveParamEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);  // <-- d 는 main메서드의 지역변수 명
        System.out.println("***** After change(d) *****");
        System.out.println("main() : x = " + d.x);
    }
    static void change(Data2 d) { // <-- d 는 change 메서드의 지역변수 명
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}

class Data2 { int x; }
