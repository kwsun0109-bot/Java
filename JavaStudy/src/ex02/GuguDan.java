package ex02;

public class GuguDan {

    int dan = 0;
    int num = 0;

    public GuguDan() {

    }
    public GuguDan(int dan){
        this.dan = dan; // this.dan : 인스턴스 변수, dan : 지역변수
    }
    public GuguDan(int dan, int num) {
        this.dan = dan;
        this.num = num;
    }
    public void GuguDanD(int a) {
        System.out.println(a + "단");
        for (int i=a; i<=a; i++) {
            for (int j=1; j<=9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }

    public void GuguDanExpr(int a, int b){
        System.out.println(a);
        System.out.println(b);
        System.out.println("구구단");
        for (int i=1; i<=a; i++) {
            for (int j=2; j<=b; j++) {
                System.out.printf("%d*%d=%2d " , j, i, i*j);
            }
            System.out.println();
        }
    }
}




