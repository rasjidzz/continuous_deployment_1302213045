import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();

		System.out.println("Muhammad Risjad Shidqi Febian - 1302213045");
		System.out.println("Continuous Development - Success Version");
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
