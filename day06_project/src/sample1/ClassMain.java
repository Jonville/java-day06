package sample1;

public class ClassMain {

	public static void main(String[] args) {

		ClassA classA = new ClassA();
		
		classA.a = 10;
		classA.b = 20;
		classA.c = 30; 
//		classA.d = 40; 	// private 이라 다른 클래스에 접근을 못한다.


		
	}

}
