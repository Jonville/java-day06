/*
 * 접근 제어자 -> public , private
 * private 은 본인 class 내부에서만 접근 가능
 * 
 * new 로 인스턴스 생성을 하면 , 그 인스턴스의 주소값을 갖게된다! ( 값이랑 주소랑은 다른 개념임 )
 * 
 *  return 은 꼭 데이터 타입을 맞춰줘야한다.
 *
 */

package day06_project;

public class Person {

	private String name;		// 웬만하면 private 로 지정 해주자
	private String job;
	private int age;
	private String sex;
	private String bloodType;

	Person(String name, String job, int age, String sex, String bloodType) {

		this.name = name;
		this.job = job;
		this.age = age;
		this.sex = sex;
		this.bloodType = bloodType;

	}

	void eat() {
	}

	void sleep() {
	}

	void speak() {
	}

	void walk() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

}
