package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.TestBean;
import kr.co.softcampus.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		// 자바 코드로 객채를 생성해보자
		TestBean t1= new TestBean();
		t1.printData();
//		위와 코드를 작성할시 매게변수가 없는 기본 생성자가 생성이 된다.
	
		System.out.println("------------------------");
		
		TestBean t2 = new TestBean(100);
		t2.printData();
//		정수값 하나를 넣었기 때문에 정수값 하나를 매게변수가 된다.
	
//		TestBean 의 기본 생성자
//		data1 : 0
//		data2 : 0.000000
//		data3 : null
//		자바 코드로 객채를 생성해서 사용 가능합니다.
		
		System.out.println("------------------------");
		
		TestBean obj1 = ctx.getBean("obj1", TestBean.class);
		obj1.printData();
//		위와같은 값을 확인 할 수 있다.
//		기본생성자가 호출이 되며, 기본생성자가 호출이 된것을 확인 할 수 있다.
		
		
		System.out.println("------------------------");
		TestBean obj2 = ctx.getBean("obj2", TestBean.class);
		obj2.printData();
//		<constructor-arg value='100' type='int'/> beans.xml obj2 값을 100이라고 적었기 때문에 100값의 생성 
		
		System.out.println("------------------------");
		
		TestBean t3 = new TestBean(11.11);
		t3.printData();
		
		System.out.println("------------------------");
		
		TestBean obj3 = ctx.getBean("obj3", TestBean.class);
		obj3.printData();
//		<constructor-arg value='11.11' type='double'/> 더블형 값 선언 
		
		System.out.println("------------------------");
		
		TestBean t4 = new TestBean("테스트중입니다 ");
		t4.printData();
		
		System.out.println("------------------------");
		
		TestBean obj4 = ctx.getBean("obj4", TestBean.class);
		obj4.printData();
//		<constructor-arg value='테스트중입니다.'/> 여기서 선언한 값을 입력받아서 사용합니다. 
//		
//		문자열이 최우선, 숫자 타입은 더블 - 인티져 형으로 중요도가 정해진다.
//		즉 타입의 형태를 입력하게되면 조금더 완벽하게 데이터 형식을 저장할 수 있다.
		
		System.out.println("------------------------");
		
		TestBean t5 = new TestBean(200, 22.22, "Hello");
		t5.printData();
		
		System.out.println("------------------------");
		
		TestBean obj5 = ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		
//		<constructor-arg value='200' type='int'/>
//		<constructor-arg value='22.22' type='double'/>
//		<constructor-arg value='안녕하세요' type='java.lang.String'/>
//		이 데이터값을 입력 해주었다.
		
//		객채의 순서를 바꾸게 된다면 어떻게 될까? 위의 코드를 인용해서 테스트 해보자 71라인은 인트 더블 스트링인데
//		아래의 순서는 스트링 인트 더블형이다 
//				
//		TestBean t6 = new TestBean("Hello~~~~!", 200.11, 22);
//		t6.printData();		
//		생성자에 선언되어있는 매게변수 순서에따라서 값을 입력해야한다, 순서대로 정의되어있는 값이 없기 떄문에 오류가 발생한다.
		
//		위의 테스트를 .xml 에서 테스트를 해보기위해서 생성된 매게변수의 수와 다르게 입력을 해보고 테스트를 해 보자.
//		<bean id='obj6' class='kr.co.softcampus.beans.TestBean' lazy-init='true'>
//		<constructor-arg value='반갑습니다' type='java.lang.String'/>
//		<constructor-arg value='300' type='int'/>
//		<constructor-arg value='33.33' type='double'/>
				
		TestBean obj6 = ctx.getBean("obj6", TestBean.class);
		obj6.printData();
//		TestBean의 생성자 : 변수 3개		data1 : 300		data2 : 33.330000		data3 : 반갑습니다
//		출력결과는 생성해둔 매게변수의 순서에 맞게 값이 들어가서 출력이 된다.
		
//		<bean id='obj7' class='kr.co.softcampus.beans.TestBean' lazy-init='true'>
//		<constructor-arg value='44.44' type='double' index='1'/>
//		<constructor-arg value='44' type='int' index='0'/>
//		<constructor-arg value='안녕하세요' type='java.lang.String' index='2'/>
//		인덱스 값을 주어서 결과값을 출력할때, 순서를 정할수가 있다.
		TestBean obj7 = ctx.getBean("obj7", TestBean.class);
		obj7.printData();
//		TestBean의 생성자 : 변수 3개		data1 : 44		data2 : 44.440000		data3 : 안녕하세요
//		선언한 매게 변수의 순서를 원하는데로 변경해서 출력을 할 수 있다.
		
		System.out.println("------------------------");
		
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		TestBean2 t200 = new TestBean2(d1, d2);
		t200.printData();
//		data1 : kr.co.softcampus.beans.DataBean@c46bcd4
//		data2 : kr.co.softcampus.beans.DataBean@3234e239
//		두개의 객체값 주소가 들어간것을 확인 할 수 있다..
		System.out.println("------------------------");
		
//		<bean id='obj8' class='kr.co.softcampus.beans.TestBean2' lazy-init='true'>
//		<constructor-arg>
//		<bean class='kr.co.softcampus.beans.DataBean'/> 선언을 했다. 클래스를 보고 객체를만들어 주입 할 수 있다 타입, 인덱스 선언가능.
		
		System.out.println("------------------------");
		
		TestBean2 obj8 = ctx.getBean("obj8", TestBean2.class);
		obj8.printData();
//		위와 마찬가지로 같은 주소값이 출력되는 것을 볼 수 있다.  (같은 해당 주소값이아닌 주소값이 그냥 출력 됨 )
		
		
		System.out.println("------------------------");
//		이미 정의되어있는 Bean 을 주입하고 싶다면 ? 주입할때마다 객채가 생성되기 위해 프로토타입으로, 만약 프로토타입을 하지않을시 
//		같은 주소값으로 된다.
//		<bean id='data_bean' class='kr.co.softcampus.beans.DataBean' scope='prototype'/>
//		
//		<bean id='obj9' class='kr.co.softcampus.beans.TestBean2' lazy-init='true'>
//			<constructor-arg ref='data_bean'/>
//			<constructor-arg ref='data_bean'/>
		
		TestBean2 obj9 = ctx.getBean("obj9", TestBean2.class);
		obj9.printData();
		
		
		
		ctx.close();
		
	}

}
