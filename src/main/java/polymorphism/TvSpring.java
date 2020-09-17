package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvSpring {

	public static void main(String[] args) {
		//이렇게 하는 목표는 자바소스를 고치지않고 돌아가게 하는것
		//(자바소스를 고치면 컴파일도 하고 올려야하기때문에 굉장히 힘들어짐)
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml"); //얘가 객체를 만들어주는 factory인가봄
												//아까 resources에 만들어놓은 applicationContext.xml(spring bean configration file)
		//스프링으로 객체만듬
		Tv tv = (Tv)factory.getBean("tv");
	//								여기에 xml에서 설정해놓은 id를 적는듯? 그러면 class에 적어놓은 polymorphism.SamsungTV을 객체화 하는듯?
	//								xml에서 id를 변수명처럼, class를 주소값처럼 사용한거같음
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
