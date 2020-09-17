package polymorphism;

public class TvTest {

	public static void main(String[] args) {
		BeanFactory bean = new BeanFactory();
		
		
		
		//Tv tv = new SamsungTV();
		Tv tv = (Tv)bean.getBean(args[0]); //이런식으로 작업하면 소스수정없이 작업가능, 
										//실제로 이렇게하진 않지만 '이렇게 한다' 라는거만 보여주는것
										//소스(자바파일)의 수정없이 할수있게 프로그래밍하는것이 유연한 프로그래밍
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
