/*
 * private 는 본인 클래스에서만 가능
 * 
 * default 는 동일 패키지에서만 허용
 * 
 * protected 는 동일패키지와 자식 클래스에 허용
 * 
 *  public 은 모든 클래스에서 가능
 *  
 */

package java_class2;

import day06_project.Circle; // 다른 패키지에 있는 것을 데려올수있다.

public class TempClass extends Circle {

	public static void main(String[] args) {

		Circle c = new Circle();
		

	}

}
