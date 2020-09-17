package polymorphism;

public class SamsungTV implements Tv {
	//언제 상속을 받을거고, 언제 변수를 선언해서 할건가
	//isB는 상속 - Tv라는 부모가있고 삼성Tv가 있을때 이때 삼성Tv는 Tv상속받음
	//hasB - 삼성Tv와 TmaxSpeaker는 부모 관계가 아니기때문에 상속받지않고 생성해서 씀 
	private Speaker speaker;
	//멤버필드는 무조건 private = 자바의 핵심(캡슐화), 유일하게 public주는건 final
	public SamsungTV() {
		System.out.println("SamsungTV 객체화");
		//speaker = new TmaxSpeaker(); 원래 new(객체생성)은 우리가 직접하면 안된다(스프링에서는)
		//객체생성은 스프링 컨테이너가 담당함
		
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("speaker 생성자");
		this.speaker = speaker;
		//applicationContext에 tmax bean을 만들어주고 SamsungTv가 생성될때 bean을 통해 생성되게함
	}
	
	public SamsungTV(Speaker speaker, int a) {
		System.out.println("speaker, a 생성자");
		System.out.println("a : " + a);
		this.speaker = speaker;
		//applicationContext에 tmax bean을 만들어주고 SamsungTv가 생성될때 bean을 통해 생성되게함
	}
	
	public SamsungTV(int a, Speaker speaker) {
		System.out.println("speaker, a 생성자");
		System.out.println("a : " + a);
		this.speaker = speaker;
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다.");
	}
	
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
