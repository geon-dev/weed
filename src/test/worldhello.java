package test;

class Hello {
	public void call() {
		System.out.println("call");
		print();
	}
	
	public void print() {
		print();
		System.out.println("hello");
	}
}

class World extends Hello {
	public void call() {
//		System.out.println("world call");
		super.print();
	}
	public void print() {
		System.out.println("world print");
	}
}

public class worldhello {


	
	public static void main(String[] args) {
		Hello hh = new World();
		
		hh.call();
	}
}
