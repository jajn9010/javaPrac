package homework;

class Subway extends Trans {

	@Override
	protected void start() {
		name = name("지하철");
		System.out.println(name + "이 출발합니다.");
	}

	@Override
	protected void stop() {
		name = name("지하철");
		System.out.println(name + "이 멈춥니다.");
	}

}
