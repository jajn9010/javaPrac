package ex05.constructor;

public class TV {
	private String color;
	private int channel;

	public TV() {
		channel = 7;
		color = "white";
	}

	public TV(int channel, String color) {
		this.channel = channel;
		this.color = color;
	}

	public TV(String color) {
		this.color = "red";
	}

	public TV(int channel) {
		this.channel = channel;
		color = "black";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void disp() {
		System.out.println("귀하의 TV의 색상은 " + color + "이며 현재 시청중인 채널은 " + channel + "번입니다.");
	}

	public void disp(String s, int i) {
		System.out.printf("귀하의 TV의 색상은 %s이며 현재 시청중인 채널은 %d번 입니다.", s, i);
	}
}
