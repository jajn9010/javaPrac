package Quiz2;

import java.util.Objects;

public class Student {
	private String name;
	private char grade;
	private int kor, eng, com, total;
	private double avg;

	public Student(String name, int kor, int eng, int com) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		updateScore();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade() {
		this.grade = switch ((int) this.getAvg() / 10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int kor, int eng, int com) {
		this.total = kor + eng + com;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = this.getTotal() / 3.;
	}

	private void updateScore() {
		setTotal(kor, eng, com);
		setAvg();
		setGrade();
	}

	@Override
	public String toString() {
		return "\n**********" + name + "님의 성적표**********\n" + "국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com
				+ "\n총점 : " + total + ", 평점 : " + avg + "학점 : " + grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(com, eng, avg, grade, kor, name, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return com == other.com && eng == other.eng
				&& Double.doubleToLongBits(avg) == Double.doubleToLongBits(other.avg) && grade == other.grade
				&& kor == other.kor && Objects.equals(name, other.name) && total == other.total;
	}

}
