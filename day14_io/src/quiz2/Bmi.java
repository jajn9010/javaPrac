package quiz2;

import java.util.Objects;

public class Bmi {
	private String name, bmi;
	private int key;
	private double tall, weight, bmiNum;
	private boolean gender;

	public Bmi(int key, String name, double tall, double weight, boolean gender) {
		this.key = ++key;
		this.name = name;
		this.tall = tall;
		this.weight = weight;
		this.gender = gender;
		setBmiNum();
		setBmi();
	}

	public int getKey() {
		return key;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBmi() {
		return bmi;
	}

	public void setBmi() {
		if (bmiNum < 18.5)
			this.bmi = "저체중";
		else if (bmiNum >= 18.5 && bmiNum <= 22.9)
			this.bmi = "정상";
		else if (bmiNum > 23.0 && bmiNum <= 24.9)
			this.bmi = "과체중";
		else
			this.bmi = "비만";
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmiNum() {
		return bmiNum;
	}

	public void setBmiNum() {
		if(gender = true) {
			this.bmiNum = weight / (Math.pow((tall / 100), 2));
		}
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Bmi [name=" + name + ", bmi=" + bmi + ", tall=" + tall + ", weight=" + weight + ", bmiNum=" + bmiNum
				+ ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bmi, bmiNum, gender, name, tall, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bmi other = (Bmi) obj;
		return Objects.equals(bmi, other.bmi)
				&& Double.doubleToLongBits(bmiNum) == Double.doubleToLongBits(other.bmiNum) && gender == other.gender
				&& Objects.equals(name, other.name) && tall == other.tall && weight == other.weight;
	}

}
