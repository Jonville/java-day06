package day06_project;

import java.util.Scanner;

public class CurrencyConverterMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("한율 (1달러) >> ");
		
		double a = sc.nextDouble();
		
		CurrencyConverter.setRate(a);
		
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
		
		System.out.println("$100 는" + CurrencyConverter.toKWR(100) + "원 입니다.");
	}

}
