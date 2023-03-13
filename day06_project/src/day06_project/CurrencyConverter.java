package day06_project;

public class CurrencyConverter {

	private static double rate;		// 한국 원화에 대한 환율		// private 이라 현재 클래스 안에서만 사용가능
	
	public static double toDollar(double won) {		// 한국원화를 달러로 변환
		return won/rate;		
		
	}
	
	public static double toKWR(double dollar) {		// 달러를 한국 원화로 변환
		return dollar * rate;
	}
	
	public static void setRate(double r) {		// 환율 설정. KWR/$1		//
		rate = r;		// static 이라 this 사용 불가!!
	}
}
