package Quiz2;

import java.util.Objects;

public class Student {
	private String name;
	private char grade;
	private int kor, eng, com, total;
	private double evg;
	
	@Override
	public String toString() {
		return "\n**********" + name + "님의 성적표**********\n" + 
				"국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com +
				"\n총점 : " + total + ", 평점 : " + evg + "학점 : " + grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(com, eng, evg, grade, kor, name, total);
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
				&& Double.doubleToLongBits(evg) == Double.doubleToLongBits(other.evg) && grade == other.grade
				&& kor == other.kor && Objects.equals(name, other.name) && total == other.total;
	}
	
	
	
}
