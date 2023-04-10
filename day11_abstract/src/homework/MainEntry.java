package homework;

public class MainEntry {
	public static void main(String[] args) {
		
		Trans[] s = new Trans[4];
		s[0] = new Subway();
		s[1] = new Bus();
		s[2] = new Bicycle();
		s[3] = new Plane();
		
		for (int i = 0; i < s.length; i++) {
			s[i].start();
			s[i].stop();
		}
		
	}
}
