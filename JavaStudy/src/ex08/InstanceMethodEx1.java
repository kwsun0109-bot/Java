package ex08;

public class InstanceMethodEx1 {
    public static void main(String[] args) {

        int [] arr1;
        int [] arr2;
        int [] arr3;

        arr1 = new int []{1,2,3};
        arr2 = new int []{1,2,3};
        arr3 = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr3 == arr2);

        int [] intArray = new int[10];
        intArray[0] = 10;
        System.out.println(intArray[0]);

        String hobby = " ";
        if (hobby.equals(" ")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }

    }
}
