/*
 * 
 * 1. int 형 변수 2개 받아서 덧셈 후 리턴
 * 2. int 형 변수 2개 받아서 덧셈 후 리턴
 * 3. double 형 변수 2개 받아서 덧셈 후 리턴
 * 4. double 1개 , int 1개받아서 덧셈 후 리턴
 * 
 * 
 * 메소드 공부하는것이기 때문에 생성자를 안만들어준것
 */



package day06_project;

public class Calculator {

	int sum(int a, int b) {
		return a + b;

	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	double sum(double a, double b) {
		return a + b;

	}

	double sum(double a, int b) {
		return a + b;

	}
}
