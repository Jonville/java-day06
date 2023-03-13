

package day06_project;

public class PersonMain {

	public static void main(String[] args) {

		Person hong  = new Person("홍수연" , "컴퓨터과학 전공 학생" , 20 , "여" , "A");
		
		Person Lee  = new Person("이미녀" , "골프선수" , 28 , "여" , "O");

		Person Kim  = new Person("김미남" , "교수" , 47 , "남" , "AB");

		hong.setAge(30);			// 인자값을 넣어줘서 직접적인 접근을해 값을 변경해줄수있다.
		
		hong.setName("황수연");		// 말그대로 세팅 해주는것
		
		System.out.println(hong.getName());		// 말그대로 클래스에서 가져오는 것.
		System.out.println(hong.getAge());
		

	}

}

