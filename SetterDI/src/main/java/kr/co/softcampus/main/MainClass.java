package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBean obj1 = new TestBean(); //객체만들
		obj1.setData1(100); //setData1 을 갖고와서 100이란 데이터를 집어넣음 
		
		System.out.printf("obj1.data1 : %d\n", obj1.getData1());
	
//		주입원리 - 
//		<property name="data1" value="100"/>
//		
//		public void setData1 (int data1) {
//			this.data1 = data1
//		}
//		을 가정해보자, name의 data1은 setData1에 들어가고 value값은 괄호
//		데이터 data1에 주입되게 된다. 데이터형을 선언해 주어야 한다.
		
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1.data1 : %d\n", t1.getData1());
		System.out.printf("t1.data2 : %f\n", t1.getData2());
		System.out.printf("t1.data3 : %s\n", t1.isData3());
		System.out.printf("t1.data4 : %s\n", t1.getData4());
		System.out.printf("t1.data5 : %s\n", t1.getData5());
		System.out.printf("t1.data6 : %s\n", t1.getData6());
		
		ctx.close();
	}

}











