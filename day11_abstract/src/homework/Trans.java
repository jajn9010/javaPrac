package homework;

abstract class Trans {
	String name = " ";
	
	protected abstract void start();
	protected abstract void stop();
	
	protected String name(String name) {
		return name;
	}
	
}
