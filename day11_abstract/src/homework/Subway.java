package homework;

class Subway extends Trans {

	@Override
	protected void start(String name) {
		System.out.println(name + "이 출발합니다.");
	}

	@Override
	protected void stop(String name) {
		System.out.println(name + "이 멈춥니다.");
	}

}
