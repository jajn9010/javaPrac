package homework;

public class Plane extends Trans {

	@Override
	protected void start() {
		name = name("비행기");
		System.out.println(name + "가 출발합니다.");
	}

	@Override
	protected void stop() {
		name = name("비행기");
		System.out.println(name + "가 멈춥니다.");
	}

}
