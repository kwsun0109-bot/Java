package ex01;

import java.io.FileReader;
import java.io.IOException;

public class TestEx02 {

	public static void main(String[] args) throws IOException {
		
        // 파일 열기
        FileReader fr = new FileReader("src/ex01/test.txt");
        
        int data;

        while ((data = fr.read()) != -1) {

            System.out.print((char)data);
        }
        
        // 파일 닫기
        fr.close();

	}

}
