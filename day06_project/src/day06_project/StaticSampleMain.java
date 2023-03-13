/*
 * 
 * static 변수는 값을 공유 한다. 
 * 			--> static 으로 된 b 는 결국 모두 같은것이라는 얘기
 * 			--> 모두가 다같이 공유하는 값이라고 생각하면 됨.
 * 
 * 
 * static 은 non - static에 접근을 할수없다.
 * 왜냐면 non-static은 객체가 생성되고 나서 쓰이는것이고, static은 클래스에서 생성되기때문임
 * 
 * 그냥 불가능함 외우라
 * 
 * static 는 this를 사용할수없다.
 *  		--> this 본인 객체를 말하는것인데 static은 객체를 생성하지 않아서 논리적으로 불가능.
 * 
 * 
 * -----------------------------------------------------------
 * 
 * 
 * final 은 수정 불가능하게 만들어준다.
 * final Class -> 클래스 상속 불가
 * final Method -> 오버라이딩 불가
 * 
 */


package day06_project;

public class StaticSampleMain {

	public static void main(String[] args) {

		StaticSample.f();

		System.out.println(StaticSample.b);
		
		StaticSample s = new StaticSample();
		
		s.b = 10;
		s.a = 10;
		
		System.out.println(StaticSample.b);
		
		StaticSample s2 = new StaticSample();

		s2.b = 500;
		s2.a = 500;
		
		System.out.println(StaticSample.b); // <= static 이라 클래스.변수 로 선언가능			/// 결국 이 세개가 같다.
		System.out.println(s.b);					// static 변수는 저장공간이 있는게 아니고 그냥 값을 공유하는것임.
		System.out.println(s2.b);

//		System.out.println(StaticSample.a);		// 불가능.   non-static이기 때문에
		System.out.println(s.a);
		System.out.println(s2.a);
	
		
	}

}
