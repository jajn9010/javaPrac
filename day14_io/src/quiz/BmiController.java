package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BmiController {
	static HashMap<Integer, Object> bmiMap = new HashMap<>();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void addBmi(Bmi bmi) {
		bmiMap.put(bmi.getId(), bmi);
	}

	public static void deleteBmi(int id) {
		bmiMap.remove(id-1);
	}
	
	public static void update(int id) throws NumberFormatException, IOException {
		System.out.println("고객님의 이름을 입력해주세요.");
		String name = br.readLine();
		System.out.println(name + "고객님의 키를 입력해주세요.");
		int tall = Integer.parseInt(br.readLine());
		System.out.println(name + "고객님의 몸무게 입력해주세요.");
		int weight = Integer.parseInt(br.readLine());
		System.out.println(name + "고객님의 성별을 입력해주세요.");
		int gender = Integer.parseInt(br.readLine());
		boolean check;
		if (gender == 1) {
			check = true;
		} else {
			check = false;
		}
						
		Bmi bmi = new Bmi(name, tall, weight, check);
		bmiMap.put(id-1, bmi);
	}

	public static void save() throws IOException {
		String fileName = "C:\\study\\1_Java\\Data\\Customer.txt";
		File file = new File(fileName);
		
		FileWriter fw = new FileWriter(file, true);
		
		for (int i = 0; i < bmiMap.size(); i++) {
			Bmi a = (Bmi) bmiMap.get(i);
			fw.write(a.getName() + "\n");
			fw.write(a.isGender() + "\n");
			fw.write(a.getTall() + "\n");
			fw.write(a.getWeight() + "\n");
			fw.write(a.getBmiNum() + "\n");
			fw.write(a.getBmi() + "\n");
		}
		
		fw.flush();
		fw.close();
	}

	public static void print() {
		if (bmiMap.size() == 0) {
			System.out.println("등록된 고객이 없습니다.");
		} else {
			System.out.println(
					"\nID\t이름\t성별\t키\t\t몸무게\t\tBMI지수\t\tBMI\n===================================================================");
			for (int i = 0; i < bmiMap.size(); i++) {
				Bmi a = (Bmi) bmiMap.get(i);
				String gen = "";
				if (a.isGender())
					gen = "남성";
				else
					gen = "여성";

				System.out.printf("%2d번\t%3s\t%2s\t%3dcm\t\t%3dkg\t\t%3.2f\t\t%3s\n", a.getId()+1, a.getName(), gen,
						a.getTall(), a.getWeight(), a.getBmiNum(), a.getBmi());
			}
		}
	}
}
