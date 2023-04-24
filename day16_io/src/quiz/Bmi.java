package quiz;

import java.util.Objects;

public class Bmi {
	private String name, bmi;
	private int tall, weight;
	private boolean gender;
	private double bmiNum;
	private final int id;
	private static int count;

	public Bmi(String name, int tall, int weight, boolean gender) {
		this.name = name;
		this.tall = tall;
		this.weight = weight;
		this.gender = gender;
		this.id = count++;
		setBmiNum();
		setBmi();
	}

	@Override
	public String toString() {
		return "Bmi [name=" + name + ", bmi=" + bmi + ", tall=" + tall + ", weight=" + weight + ", gender=" + gender
				+ ", bmiNum=" + bmiNum + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bmi, bmiNum, gender, id, name, tall, weight);
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
				&& id == other.id && Objects.equals(name, other.name) && tall == other.tall && weight == other.weight;
	}

	public int getId() {
		return id;
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

	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getBmiNum() {
		return bmiNum;
	}

	public void setBmiNum() {
		this.bmiNum = weight / (((tall / 100.) * (tall / 100.)));
	}

}
