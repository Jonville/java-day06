
/*
 * 
 *  메소드... <= 함수와 같은 기능
 *  
 *  !!기능!! 이라고 생각하면됨, ex) 밥먹기, 술먹기, 잠자기, 운동하기 ...등등
 *  
 *  메소드는 클래스 안에있어야함 (캡슐화 원칙)
 *  
 *  기본 타입의 값 ( int , double 등등) 전달이 되면 그 값은 변경되지 않음.
 *  그러나 객체나 배열을 전달 하면.. 레퍼런스가 전달 되기때문에.. 객체나 배열자체를 공유
 *  
 *  값을 보내는거랑 레퍼런스를 보내는거랑 다름. (중요!!)
 *  
 *  
 */

package day06_project;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		Book[] book = new Book[2];

		Scanner sc = new Scanner(System.in);

		// 값을 넣는 부분(객체를 배열에 넣는 부분)
		for (int i = 0; i < book.length; i++) {

			System.out.println("제목을 입력하세요 : ");
			String title = sc.nextLine();
			System.out.println("작가를 입력하세요 : ");
			String author = sc.nextLine();

			book[i] = new Book(title, author);
		}

		
		
		// 객체 배열을 출력하는 부분
		for (int i = 0; i < book.length; i++) {
			
//			String title = book[i].getTitle();
//			String author = book[i].getAuthor();

			System.out.println("책 제목은 : " + book[i].getTitle() + " , 작가 이름은 : " + book[i].getAuthor());

		}
	}

}
