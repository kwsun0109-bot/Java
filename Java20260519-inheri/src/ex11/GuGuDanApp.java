package ex11;

public class GuGuDanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;
		
		System.out.println("난수(dan) :" + dan + " 난수(number) :" + number);

		if ((dan >=1 && dan <= 9) && (number >= 1 && number <= 9)){
			GuGuDanExpr gugu = new GuGuDanExpr(dan, number);
			gugu.
			if (dan == 3 && number == 4) {
				gugu.printPart();				
			}
			gugu.printPart();	
		}	
		if ((dan >=1 && dan <= 9) && (number >=10)){
			GuGuDanExpr gugu1 = new GuGuDanExpr(dan, number);
			if (dan == 2) {
				gugu1.printPart();				
			}else if (dan >= 10){
				gugu1.printAll();				
			}
		}

	}

}
