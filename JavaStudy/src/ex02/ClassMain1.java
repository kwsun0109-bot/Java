package ex02;

import java.util.Scanner;

public class ClassMain1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 압력하세요.");
        int num = sc.nextInt();
        System.out.println("구구단 몇단?.");
        int dan = sc.nextInt();

        GuguDan gu = new GuguDan(num, dan);
        if (num == 0) {
            gu.GuguDanD(dan);
        } else {
            gu.GuguDanExpr(num, dan);
        }
    }
}
