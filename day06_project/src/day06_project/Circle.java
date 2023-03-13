package day06_project;

public class Circle {

	int radius;		// public 으로 하면 다른 패키지에서도 가능하게 한다.
	String name;

	double getArea() {
		return 3.14 * radius * radius;
	}

}
