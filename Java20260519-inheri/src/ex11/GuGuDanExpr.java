package ex11;

public class GuGuDanExpr extends Multiplication {

	 GuGuDanExpr() {} 
	 
	 GuGuDanExpr(int dan){
		 super(dan);
	 }
	 
	 GuGuDanExpr(int dan, int number){
		 super(dan, number);
	 }

	 public static void printAll() {
		 for(int i=1; i<=dan; i++) {
			 for (int j=1; j<=number; j++) {
				 System.out.print(j + "*" + i + "=" + j*i);
			 }
			 System.out.println();
		 }
	 }
	 
}