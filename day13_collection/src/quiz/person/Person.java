package quiz.person;

import java.text.ChoiceFormat;
import java.util.Objects;

public class Person {
	private String name, depart, position, address, phone, job;
	private int kor, eng, com, age, total, pay;
	private double avg;
	private boolean reg;
	private String grade;
	private final int id = 0;
	private final int c_Id = 0;
	private final int s_Id = 0;
	private static int count = 0;
	private static int c_Count = 0;
	private static int s_Count = 0;

	@Override
	public int hashCode() {
		return Objects.hash(address, age, avg, c_Id, com, depart, eng, grade, id, job, kor, name, pay, phone, position,
				reg, s_Id, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && age == other.age && avg == other.avg && c_Id == other.c_Id
				&& com == other.com && Objects.equals(depart, other.depart) && eng == other.eng && grade == other.grade
				&& id == other.id && Objects.equals(job, other.job) && kor == other.kor
				&& Objects.equals(name, other.name) && pay == other.pay && Objects.equals(phone, other.phone)
				&& Objects.equals(position, other.position) && reg == other.reg && s_Id == other.s_Id
				&& total == other.total;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", depart=" + depart + ", position=" + position + ", address=" + address
				+ ", phone=" + phone + ", job=" + job + ", kor=" + kor + ", eng=" + eng + ", com=" + com + ", avg="
				+ avg + ", age=" + age + ", total=" + total + ", pay=" + pay + ", reg=" + reg + ", grade=" + grade
				+ ", id=" + id + ", c_Id=" + c_Id + ", s_Id=" + s_Id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
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

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = total/3.;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = kor + eng + com;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public boolean isReg() {
		return reg;
	}

	public void setReg(boolean reg) {
		this.reg = reg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		String pattern = "50#F|60#D|70#C|80#B|90#A" ;
		ChoiceFormat  form = new ChoiceFormat(pattern);
		
		this.grade = form.format(getAvg());
	}

}
