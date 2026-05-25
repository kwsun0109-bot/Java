package ex02;

class Box<T>{
	
	T item;		// 여기서  T 는 임의이 타입임
	
	void setItem(T item) {

		this.item = item;
	}
	
	T getItem() {

		return item;
	}
}

/*
 * Box<Car> box = new Box<Car>()
class Box<T>{
	
	Car item;
	
	void setItem(Car item) {
		this.item = item;
	}
	
	Car getItem() {
		return item;
	}
}
*/

/*
Box<Bus> box2 = new Box<Bus>();
class Box<T>{
	
	Bus item;
	
	void setItem(Bus item) {
		this.item = item;
	}
	
	Bus getItem() {
		return item;
	}
}
*/




















