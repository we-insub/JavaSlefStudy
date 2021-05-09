# JavaSlefStudy
SpringFFramework


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
