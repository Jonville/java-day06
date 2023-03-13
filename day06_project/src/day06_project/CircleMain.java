package day06_project;

public class CircleMain {

	public static void main(String[] args) {

		int q = 10;

		Circle c = new Circle(); // c ==> qwer (주소)

		c.radius = 10; // ==> qwer.radius = 10 ; 라는 뜻 qwer 이라는 주소에

		increase(q);

		increase(c);

		System.out.println(q);
		System.out.println(c.radius); // qwer.radius 주소를 불러들인다.

	}

	static void increase(int a) { // 이 친구도 Ex_01_CircleMain 클래스 안에 있기때문에 메소드 선언 가능.

		a = a + 1;

	}

	static void increase(Circle q) { // q = > qwer

		q.radius++; // ==> qwer.radius++; 가 됨
	}

}
