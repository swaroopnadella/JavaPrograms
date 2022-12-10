package oops;

public class ClassCastExcep {

	public static void main(String[] args) {
		
		Car c = new BMW();
		System.out.println("----------------");
		BMW c1 = new BMW();
		System.out.println("----------------");
		BMW bm = (BMW)new Car(); //ClassCastException is thrown in Runtime

	}

}
