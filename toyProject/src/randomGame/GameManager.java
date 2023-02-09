package randomGame;

import java.util.Scanner;

public class GameManager {
	
	public int userCounter() {

		System.out.println("게임에 참여할 인원을 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public void createUser(int cnt) {
		for(int i=0;i<cnt;i++) {
			UserList ul[] = new UserList[cnt];
			
			Scanner in = new Scanner(System.in);
			System.out.println("참여자의 나이와 이름을 입력해 주세요.");
			
			System.out.println("나이 : ");
			int age = in.nextInt();
			
			underAgeReading(age);
			
			System.out.println("이름 : ");
			String name = in.next();
			
			ul[i] = new UserList(age, name);
			
			System.out.println(ul[i].toString());
		}
	}
	
	 
	public void underAgeReading(int age) {
			if(age<20) {
				System.out.println("미성년자는 게임해 참가하실 수 없습니다.\n"
						+ "게임을 종료합니다.");
				System.exit(0);
			}
	}
	
	public int choiceGame() {
		System.out.println("게임의 번호를 선택해주세요.\n 1.369게임\n 2.베스킨라빈스31\n"
				+ "폭탄 돌리기\n 이순신게임\n");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
