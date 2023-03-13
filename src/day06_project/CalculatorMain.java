/*
 * 
 * 1. int 형 변수 2개 받아서 덧셈 후 리턴
 * 2. int 형 변수 2개 받아서 덧셈 후 리턴
 * 3. double 형 변수 2개 받아서 덧셈 후 리턴
 * 4. double 1개 , int 1개받아서 덧셈 후 리턴
 *
 * 
 * 객체 주소자체가 없는 상태를 null  이라고 한다.
 * 
 *  a = null ; 이라고 하면 a 가 가리키고 있는 주소 방향을 잃는다.
 */

package day06_project;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator c = new Calculator();

		System.out.println(c.sum(1, 2));
		System.out.println(c.sum(1, 2, 3));
		System.out.println(c.sum(1.1, 2.2));
		System.out.println(c.sum(1.1, 2));

//		int a = c.sum(3, 5);			// 이렇게 도 쓸수있음
//		double b = c.sum(3, 3.5);
//		double d = c.sum(2.5, 2.5);
//		int e = c.sum(3, 4, 5);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(d);
//		System.out.println(e);
	}

}
