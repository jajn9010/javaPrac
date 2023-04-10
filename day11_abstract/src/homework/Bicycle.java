package homework;

class Bicycle extends Trans {

	@Override
	protected void start() {
		name = name("자전거");
		System.out.println(name + "가 출발합니다.");
	}

	@Override
	protected void stop() {
		name = name("자전거");
		System.out.println(name + "가 멈춥니다.");
	}

}
