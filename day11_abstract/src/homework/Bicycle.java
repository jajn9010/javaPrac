package homework;

class Bicycle extends Trans {

	@Override
	protected void start(String name) {
		System.out.println(name + "가 출발합니다.");
	}

	@Override
	protected void stop(String name) {
		System.out.println(name + "가 멈춥니다.");
	}

}
