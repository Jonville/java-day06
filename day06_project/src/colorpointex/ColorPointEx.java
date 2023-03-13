package colorpointex;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point(); // Point 객체 생성

		p.set(1, 2); // Point 클래스의 매개변수를 세팅함
		p.showPoint(); // Point 클래스의 showPoint() 메소드를 불러들임

		ColorPoint cp = new ColorPoint();

		cp.set(3, 4); // Point 클래스의 set() 메소드를 호출
		cp.setColor("Red"); // ColorPoint 클래스의 setColor() 메소드를 호출
		cp.showColorPoint(); // ColorPoint 클래스의 showColorPoint를 호출

	}

}
