package homework;

class Bus extends Trans {

	@Override
	protected void start() {
		name = name("버스");
		System.out.println(name + "가 출발합니다.");
	}

	@Override
	protected void stop() {
		name = name("버스");
		System.out.println(name + "가 멈춥니다.");
	}

}
