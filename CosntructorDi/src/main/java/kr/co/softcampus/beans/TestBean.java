package kr.co.softcampus.beans;

public class TestBean {

	
	private int data1;
	private double data2;
	private String data3;
	
	
	public TestBean() {
		System.out.println("TestBean 의 기본 생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	
//	정수갑 하나를 받는 생성자를 만들어 보자.
	public TestBean(int data1) {
		System.out.println("TestBean 생성자 : Int 변수1개 ");
		this.data1 = data1;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public TestBean(double data2) {
		System.out.println("TestBean의 생성자 : double 변수 1개");
		this.data1 = 0;
		this.data2 = data2;
		this.data3 = null;
	}	
	
	public TestBean(String data3) {
		System.out.println("TestBean의 생성자 : 문자열 변수 1개");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = "Test중 입니다";
	}
	
	
	public TestBean(int data1, double data2, String data3) {
		System.out.println("TestBean의 생성자 : 변수 3개");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	
	
	public void printData () {
		System.out.printf("data1 : %d\n", data1);
		System.out.printf("data2 : %f\n", data2);
		System.out.printf("data3 : %s\n", data3);
	}
	
}


