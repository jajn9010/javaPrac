package ex03.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {

		Map map = new HashMap();

		map.put("kosa", "1234");
		map.put("daebo", "1004");
		map.put("doyeon", "7895");
		map.put("kosa1", "1234");

		System.out.println("요소 개수 : " + map.size());
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("pwd : ");
			String pwd = sc.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue; // 무한루프가 아닌 조건문으로 걸었으면 바로 빠져나가므로 continue작성해야한다.
			} else {
				if (!map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 pwd가 일치합니다.");
					break;
				}
			}
		}
	}
}
