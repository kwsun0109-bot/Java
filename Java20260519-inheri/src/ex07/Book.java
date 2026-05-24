package ex07;

public class Book {
	String title;
	String anthor;
	int price;
	
	Book(){
		this("자바의정석", "남궁성", 45000);
	}
	
	Book(String title, String anthor, int price){
		this.title = title;
		this.anthor = anthor;
		this.price = price;
	}
	
	String getBookInfo(){
		return "제목 : " + title + "," + " 저자 : " + anthor + "," + " 가격 : " + price; 
	}

}
