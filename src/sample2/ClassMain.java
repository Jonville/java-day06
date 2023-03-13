/*
 *  
 *  static 이 붙으면 클래스이름으로 접근이 가능해진다.
 *  		-> 인스턴스를 생성하지않아도 사용가능하다.
 *  
 *  		보통 static은 final 이랑 같이 사용한다.
 *  			-> 수정 되면 안되는것들에 사용된다.
 * 
 */

package sample2;

import sample1.ClassA;

public class ClassMain {

	public static void main(String[] args) {

		ClassA classA = new ClassA();

		classA.a = 10;
		
//		classA.b = 20;	// protected 는 다른패키지에 접근을 못한다.
//		classA.c = 30;  // default 는 다른패키지에 접근을 못한다.
//		classA.d = 40; 	// private 이라 다른 클래스에 접근을 못한다.
		
		

	}

}
