# JavaSlefStudy
SpringFFramework


--------- 각각의 폴더안에 MainClass 에 주석으로 해석을 하였습니다. 나중에 다시볼때 기억을 빨리 되 살리기 위함 입니다 



기본적으로 스프링프레임워크에대한 셀프스터디 공간입니다.
파이썬을 공부하였던 저로써는 (물론 개미핥기식이지만)
모르는 부분들이 상당히 많고 신긴부분들이 많아 배우는데 재미를 갖고 임하고있습니다.


각 디렉토리별이아닌 상위에 있는 pom.xml / beans.xml 은 기본적인 제가 사용한버전입니다.
매번 이 기본적인것들을 사용해서 기본틀로 잡고, 그위에 필요한것들과, 메소드 선언, 주소값, ID, Class 등 작성하여사용하였습니다.


BeanPostProcessor - 
*Bean 객체를 정의 할 때 init-method 속성을 설정하면 객체가 생성될 때 자동으로 홑출될 메소드를 지정할수 있으며
*BeanPostProcessor 인터페이스를 구현한 클래스를 정의하면 Bean 객체를 생성할 때 호출될 init 메서드 호출을 가로채 다른 메서드를 호출 할 수 있다.
*postProcessBeforeinitalization : init-method 에 지정된 메서드가 호출되기 전에
*postProcessBeforeinitalization : init-method에 지정된 메서드가 호출된 후에 호출된다
*init-method 가 지정되어 있지 않더라도 자동으로 호출된다.


*Dependency Injection (의존성 주입)
*의존성 주입은 Spring 에서 아주 중요한 개념이자 장점이다.
*Bean 객체를 생성 할 때 Bean 객체가 관리할 값이나 객체를 주입하는 것을 의미 한다.
*Bean 객채를 생성 한 후 Bean 객체가 가질 기본 값을 자바 코드로 설정하는 것이 아닌 Bean을 정의하는 XML 코드에서 정의하는 개념입니다.
(객체에 변수들의 값이 이것이다 라고 정해져있을경우 사용개념)
value = 기본 자료형 값과 문자열 값을 설정한다.
ref = 객체를 설정한다.
ttype =  저장할 값의 타입을 설정한다.
index =  지정된 값을 주입할 생성자의 매게변수 인덱스 번호 


*Setter 메서드를 통한 주입(SetterDI)
* Bean 을 정의 할때 Bean 객체가 가지고 있을 기본 값을 생성자가 아닌 Setter 메서드를 통해 주입 할 수 있다.
주입원리 - 
		<property name="data1" value="100"/>
		
		public void setData1 (int data1) {
			this.data1 = data1
		}
		을 가정해보자, name의 data1은 setData1에 들어가고 value값은 괄호
		데이터 data1에 주입되게 된다. 데이터형을 선언해 주어야 한다.
		
		<property name="data6" ref='data_bean'/> ㅌ
		데이터 data1에 주입되게 된다. 데이터형을 선언해 주어야 한다 
		.xml 에서 <property name="data6" ref='data_bean'/> 정해진 Bean 을 주입할땐 Ref를 사용하면 된다. 



*컬렉션 타입 (CollectionDI)
*Bean 을 정의 할 때 주입해야 하는 멤버가 컬렉션인 경우 컬렉션이 관리할 객체를 초기에 설정 할 수 있다.
*여기에서는 List, Map, Set, Property을 사용 하도록 한다.

	private Map<String, Object> map1;
Object 로 벨류값을 넣는이유는 다양한 데이터 형태로 값을 집어넣을 것이기 때문이다.
Object = 자바에서는 모든 클래스의 객체의 값을 모두 받을 수 있다.
.xml 에서 맵의 선언은 entry 태그로 묶어서 사용 한다.

	private Map<String, Object> map1;
Object 로 벨류값을 넣는이유는 다양한 데이터 형태로 값을 집어넣을 것이기 때문이다.
Object = 자바에서는 모든 클래스의 객체의 값을 모두 받을 수 있다.
	
	
	<property name="map1">
		<map>
			<entry key="a1" value='문자열'/> 문자열 스트링 입력 
			<entry key='a2' value='100' value-type='int'/> 벨류 타입을 선언하지않으면 스트링타입으로 입력이 된다. 그러므로 데이터타입선언
			<entry key='a3'> 
				<bean class='kr.co.softcampus.beans.DataBean'/> 객체를 주입하기.
			</entry>
			<entry key='a4' value-ref="data_bean"/> 이미 정해져 있는 Bean vlaue_ref 를 주입해주면 사용이 가능하다.
			<entry key='a5'> 리스트를 주입 한다.


*자동 주입(AutoWire)

*Bean 을 정의 할 떄 주입할 객체는 생성자를 통한 주입이나 Setter 를 통한 주입을 사용 했다.

*Spring 에서는 객체를 주입 할 때 자동으로 주입될 수 있도록 설정 할 수 있다.

*자동 주입은 이름, 타입, 생성자를 통할 수 있으며 auto wire 라는 용어로 부른다.

*이름을 통한 주입

*byName : 빈 객체의 프로퍼티 이름과 정의된 빈의 이름이 같은 것을 찾아 자동으로 주입한다.

<bean id="data1" class="kr.co.~~~~~~dataclass1"/>	private DataClass1 data1; 

<bean id="data2" class="kr.co.~~~~~~datacalss2"/>	private DataClass2 data2;

set data1 / date2 를 만들어서 주입하는 개념이다.

*타입을 통한 주입
*byType : 빈 객채의 프로퍼티 타입과 정의된 빈의 타입이 일치할 경우 주입이 된다.

* 이때 동일 타입의 빈이 두개이상 정의 되어 있다면 충돌이 발생되어 오류가 발생한다.
<bean id="data3" = clanss="kr.co.~~~~datacclass2/>	
			   private Dataclass2 obj1; , private DataClass2 obj2;
			   
*constructor : 생성자의 매게 변수 타입과 정의된 빈의 타입이 일치할 경우 주입된다.
이때 동일 타입의 빈이 두개이상 정의되어 있으면 오류가 발생한다.
<bean id="data30" class"kr.co.~~~~~~DataClass3"/>

public Testbean3(DataClass3 data30, Dataclass3 data33){
this.data30 = data30;
this.data33 = data33l
}
정수형 문자열은 주입 되지 않는다.

<bean id='obj5' class='kr.co.softcampus.beans.TestBean3' autowire="constructor"/>

생성자와 일치하는것을 찾아서 자동으로 대입해 준다.

