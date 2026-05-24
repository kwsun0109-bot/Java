package ex10;

public class FriendTest {

	public static void main(String[] args) {
		
		Friend [] f = new Friend[5];
		f[0] = new Friend("홍길동", "010-1234-5678","abc@nnnn.com");
		f[1] = new Friend("이순신", "010-4321-1111","dfr@ssss.com");
		f[2] = new Friend("유관순", "010-1478-2547","dgt@ffff.com");
		f[3] = new Friend("이순신", "010-5678-7678","hju@ssss.com");
		f[4] = new Friend("유관순", "010-6598-0054","ggg@erdf.com");

		System.out.println("이름" + "   " +"전화변호" + "          " + "메일주소");
		System.out.println("----------------------------------------------");
		
		for (int i=0; i<f.length; i++) {
//			System.out.println(f[i].getInfo());
//			System.out.println(f[i].toString());
			System.out.println(f[i]);
		}

	}	
}
