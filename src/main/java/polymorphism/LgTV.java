package polymorphism;

public class LgTV implements Tv{
//	public void turnOn() {
//		System.out.println("LgTV --- 전원 켠다.");
//	}
//	
//	public void turnOff() {
//		System.out.println("LgTV --- 전원 끈다.");
//	}
//	
//	public void soundUp() {
//		System.out.println("LgTV --- 소리 올린다.");
//	}
//	
//	public void soundDown() {
//		System.out.println("LgTV --- 소리 내린다.");
//	}
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV 객체화");
	};
	
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다.");
		
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
