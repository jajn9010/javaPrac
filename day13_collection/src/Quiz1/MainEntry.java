package Quiz1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEntry {
	
	public static void main(String[] args) {
		boolean lend = false;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		Map <Integer, Video> videos = new HashMap<>();
		
		
		 do {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1.비디오 추가, 2.비디오 삭제, 3.비디오 리스트 출력, 4.정보 수정, 5.프로그램 종료");
			int n = sc.nextInt();
			sc.nextLine();
			
			switch (n) {
				case 1: 
					System.out.println("비디오 타이틀을 입력해주세요.");
					String title = sc.nextLine();
					System.out.println("비디오 장르를 입력해주세요.");
					String category = sc.nextLine();
					System.out.println("비디오 대여 가능를 입력해주세요. (1. 대여가능, 2.대여불가능");
					num = sc.nextInt();
					sc.nextLine();
					if(num == 1) lend = true;
					else if (num < 0 || num >2)	System.out.println("잘못입력하셨습니다. 1번과 2번중 입력해주십시오.");
					else lend = false;
					String lendName = "";
					if (lend == true) {
						System.out.println("비디오 대여자를 입력해주세요.");
						lendName = sc.nextLine();
					}
					String lendDate = new SimpleDateFormat("yy/MM/dd").format(new Date());
					
					Video v = new Video(title, category, lend, lendName, lendDate);
					VideoController.addVideo(videos, v);
					break;
				case 2: 
					VideoController.printList(videos);
					System.out.println("삭제할 비디오의 번호를 입력하세요.");
					Integer i = sc.nextInt();
					sc.nextLine();
					VideoController.deleteVideo(videos, i); break;
				case 3: 
					VideoController.printList(videos); break;
				case 4: 
					VideoController.printList(videos);
					System.out.println("수정할 비디오의 번호를 입력하세요.");
					Integer i2 = sc.nextInt();
					sc.nextLine();
					System.out.println("수정할 비디오 타이틀을 입력해주세요.");
					String title2 = sc.nextLine();
					System.out.println("수정할 비디오 장르를 입력해주세요.");
					String category2 = sc.nextLine();
					System.out.println("수정할 비디오 대여 가능를 입력해주세요. (1. 대여가능, 2.대여불가능");
					num = sc.nextInt();
					sc.nextLine();
					if(num == 1) lend = true;
					else if (num < 0 || num >2)	System.out.println("잘못입력하셨습니다. 1번과 2번중 입력해주십시오.");
					else lend = false;
					String lendName2 = "";
					if (lend == true) {
						System.out.println("수정할 비디오 대여자를 입력해주세요.");
						lendName2 = sc.nextLine();
					}
					String lendDate2 = new SimpleDateFormat("yy/MM/dd").format(new Date());
					Video v2 = new Video(title2, category2, lend, lendName2, lendDate2);
					VideoController.updateVideo(videos, i2, v2);
					break;
				case 5: 
					System.exit(0);
				default:
					if(n < 0 || n > 5) System.out.println("초과된 숫자를 입력하셨습니다. 번호 확인 후 다시 입력바랍니다.");
					continue;
			}
		} while(true);
	}
}
