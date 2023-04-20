package quiz2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class BmiController {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void addBmi(ArrayList<Bmi> bmiArr) {
		try {
			System.out.println("고객님의 성명을 입렵해주세요.");
			String name = br.readLine();
			boolean check = false;
			for (int j = 0; j <= 0; j++) {
				System.out.println(name + "님의 성별은 무엇입니까? (1.남성, 2.여성)");
				int gender = Integer.parseInt(br.readLine());
				if (gender == 1) {
					check = true;
				} else if (gender == 2) {
					check = false;
				} else {
					System.out.println("번호를 잘 못 입력하셨습니다. 다시 입력바랍니다.");
					j--;
				}
			}
			System.out.println("고객님의 키를 입력해주세요.");
			double tall = Integer.parseInt(br.readLine());
			System.out.println("고객님의 몸무게를 입력해주세요.");
			double weight = Integer.parseInt(br.readLine());
			if (bmiArr.size() != 0) {
				int a = bmiArr.get(bmiArr.size() - 1).getKey();
				Bmi bmi = new Bmi(a, name, tall, weight, check);
				bmiArr.add(bmi);
			} else {
				System.out.println(check);
				Bmi bmi = new Bmi(0, name, tall, weight, check);
				bmiArr.add(bmi);
				System.out.println(check + "0일때");
				System.out.println(bmi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteBmi(ArrayList<Bmi> bmiArr) {
		try {
			if (bmiArr.size() != 0) {
				print(bmiArr);
				System.out.println("삭제할 고객의 번호를 입력해주세요.");
				int num = Integer.parseInt(br.readLine());

				bmiArr.remove(num);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void print(ArrayList<Bmi> bmiArr) {
		if (bmiArr.size() != 0) {
			System.out.println("============================================================================");
			System.out.println(
					"\n번호\t이름\t성별\t키\t몸무게\t\tBMI지수\t\tBMI\n============================================================================");
			for (int i = 0; i < bmiArr.size(); i++) {
				Bmi a = (Bmi) bmiArr.get(i);
				String gen = "";
				if (a.isGender() == true) {
					gen = "남성";
				} else {
					gen = "여성";
				}
				System.out.printf("%d\t%3s\t%2s\t%3.1f\t%3.1f\t\t%3.2f\t\t%3s\n", a.getKey(), a.getName(), gen,
						a.getTall(), a.getWeight(), a.getBmiNum(), a.getBmi());
			}
		} else {
			System.out.println("등록된 고객이 없습니다.");
		}
	}

	public void updateBmi(ArrayList<Bmi> bmiArr) {
		try {
			if (bmiArr.size() != 0) {
				print(bmiArr);
				System.out.println("수정할 고객의 번호를 입력해주세요.");
				int num = Integer.parseInt(br.readLine());

				if (num <= bmiArr.size()) {
					System.out.println("무엇을 수정하시겠습니까?");
					System.out.println("1.이름, 2.성별, 3.키, 4.몸무게");
					String str = br.readLine();

					switch (str) {
					case "1": {
						System.out.println("수정할 고객님의 이름을 입력해주세요.");
						String nName = br.readLine();
						bmiArr.get(num).setName(nName);
						break;
					}
					case "2": {
						System.out.println("수정할 " + bmiArr.get(num) + "고객님의 성별 입력해주세요. (1.남성, 2.여성)");
						int a = Integer.getInteger(br.readLine());
						boolean check = false;
						if (a == 1) {
							check = true;
						} else {
							check = false;
						}
						bmiArr.get(num).setGender(check);
						break;
					}
					case "3": {
						System.out.println("수정할 " + bmiArr.get(num) + "고객님의 키를 입력해주세요.");
						Double nTall = (double) Integer.parseInt(br.readLine());
						bmiArr.get(num).setTall(nTall);
						break;
					}
					case "4": {
						System.out.println("수정할 " + bmiArr.get(num) + "고객님의 몸무게 입력해주세요.");
						Double nWeight = (double) Integer.parseInt(br.readLine());
						bmiArr.get(num).setWeight(nWeight);
						break;
					}
					default:
						System.out.println("숫자를 잘못 입력하셨습니다. 확인 후 다시 입력해주시길 바랍니다.");
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveBmi(ArrayList<Bmi> bmiArr) {
		String fileName = "C:\\study\\1_Java\\Data\\Customer.txt";
		File file = new File(fileName);
		try {
			FileWriter fw = new FileWriter(file, true);

			for (int i = 0; i < bmiArr.size(); i++) {
				Bmi a = (Bmi) bmiArr.get(i);
				fw.write(a.getName() + "\n");
				fw.write(a.isGender() + "\n");
				fw.write(a.getTall() + "\n");
				fw.write(a.getWeight() + "\n");
				fw.write(a.getBmiNum() + "\n");
				fw.write(a.getBmi() + "\n");
			}

			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
