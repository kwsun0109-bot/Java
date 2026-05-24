package ex08;

public class Product {
	String name;
	int balance;
	int price;
	
	Product(){
		this("듀크인형", 5, 10000);
	}
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	int getPrice() {
		return price;
	}
	
}
