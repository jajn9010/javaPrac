package ex05.constructor;

public class MainEntry {
	public static void main(String[] args) {

		TV tv = new TV();
		tv.disp();

		TV tv2 = new TV(25);
		tv2.disp();

		TV tv3 = new TV("green");
		tv3.disp();

		TV tv4 = new TV(15, "blue");
		tv4.disp();

//		tv.setChannel(15);
//		tv.setColor("black");
//		
//		tv.disp(tv.getColor(), tv.getChannel());
	}
}
