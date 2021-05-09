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
		.xml 에서 
		데이터 data1에 주입되게 된다. 데이터형을 선언해 주어야 한다.<property name="data6" ref='data_bean'/> 
		
		데이터 data1에 주입되게 된다. 데이터형을 선언해 주어야 한다
