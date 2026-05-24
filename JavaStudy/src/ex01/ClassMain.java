package ex01;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);

        Time [] t = new Time[3];
        System.out.println(1);
        t[0] = new Time(13, 20, 42);
        System.out.println(2);
        t[1] = new Time(20, 42, 13);
        System.out.println(3);
        t[2] = new Time(42, 13, 20);

        for (int i=0; i<t.length; i++){
            System.out.println(4);
            System.out.print(t[i]);
        }
    }
}
class Time {
    int h = 0;
    int m = 0;
    int s = 0;

    public Time () {}

    public Time (int h){
        this.h = h;
    }

    public Time (int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString(){
        System.out.println(5);
        return "[" + h + "시간" + ":" + m + "분" + ":" + s + "초]";
    }
}