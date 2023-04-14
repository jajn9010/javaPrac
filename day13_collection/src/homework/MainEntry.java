package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainEntry {  // view & controller
	public static void main(String[] args) {
		
		
		int SU = 3;
		
		Scanner sc = new Scanner(System.in);
		List<Customer> list = new ArrayList<>();
		
		while(true) {
			System.out.println("1. 고객추가, 2. 고객정보삭제, 3. 고객리스트 출력, 4. 고객정보수정, 5.프로그램 종료");
			int n = sc.nextInt();
			
			switch(n) {
			case 1 :
				System.out.println("추가할 고객의 이름, 주소, 전화번호 순으로 입력하세요.");
				Customer c = new Customer(sc.next(), sc.next(), sc.next());
				addCustomer(list, c);
				break;
			case 2 :
				System.out.println("삭제할 고객의 전화번호를 입력하세요.");
				Customer c1 = new Customer(sc.next());
				deleteCustomer(list, c1);
				break;
			case 3 :
				showCustomer(list);
				break;
			case 4 :
				System.out.println("수정할 고객의 이름을 입력하세요.");
				Customer c2 = new Customer(sc.next());
				updateCustomer(list, c2);
				break;
			case 5 :
				System.exit(0);
			default :
				if(n<0 || n>5) System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력하세요");
			}
		}
	}

	public static void updateCustomer(List<Customer> list, Customer c2) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).tel.equals(c2.tel)) {
				System.out.println("수정할 고객의 이름, 주소, 전화번호 순으로 입려해주세요.");
				Customer c = new Customer(sc.next(), sc.next(), sc.next());
				list.set(i, c);
			}else System.out.println("입력한 이름의 고객이 없습니다.");
		}
	}

	private static void showCustomer(List<Customer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		if(list.size()==0) System.out.println("출력할 고객이 없습니다.");
		
	}

	public static void deleteCustomer(List<Customer> list, Customer c) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).name.equals(c.name)) list.remove(i);
			else System.out.println("입력한 이름의 고객이 없습니다.");
		}
	}

	public static void addCustomer(List<Customer> list, Customer c) {
		list.add(c);
	}

	
}
