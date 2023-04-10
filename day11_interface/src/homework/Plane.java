package homework;

public class Plane implements Trans {

	@Override
	public void start(String name) {
		System.out.println(name + "가 이륙합니다.");
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "가 착륙합니다.");
	}

}
