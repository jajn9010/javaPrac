package ex04.oop;

public class Person {  // extends Object

		private String name, address, phone;
		private int age, height, weight;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		
		public void disp() {
			System.out.println(name + "님의 나이는 : " + age);
		}
		
//		@Override
//		public String toString() {
//			String str = name + "님의 나이는 : " + age;
//			return str;
//		}
		
		
}
