package homework;

public class Bus implements Trans {

	@Override
	public void start(String name) {
		System.out.println(name + "가 출발합니다.");
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "가 멈춥니다.");
	}

}
