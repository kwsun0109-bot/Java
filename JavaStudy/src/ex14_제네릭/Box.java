package ex14_제네릭;

class Box<T> {
	
	private T item;
	
	public void set(T item) {
		this.item = item;
	}
	public T get() {
		return item;
	}
}