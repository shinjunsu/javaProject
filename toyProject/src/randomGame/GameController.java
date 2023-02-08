package randomGame;
import java.util.Scanner;

public class GameController {
	
	
	private String userName;

	
	 public void gameStart() {
		 System.out.println("게임을 시작하겠습니다."
		 		+ "\n참가자의 인원을 입력해 주세요");
	}
	 
	 public void setHeadCounter(int setHeadCounter) {
		 this.userHeadCounter = setHeadCounter;
	 }
	 
	 public int getHeadCounter() {
		 return this.userHeadCounter;
	 }
	
	 public void underAgeReading(int age) {
		 if(age<20) {
			 System.out.println("미성년자는 게임해 참가하실 수 없습니다.\n"
			 		+ "게임을 종료합니다.");
			 System.exit(0);
		 }
	}
	 
	 public void setUserInfo() {
			for(int i=0;i<userHeadCounter;i++) {
				System.out.println(i+1 +"번째 참가자의 나이를 입력해주세요");
				Scanner in = new Scanner(System.in);
				underAgeReading(in.nextInt());
			}
	 }
	 
	//UserList ul[] = new UserList();
	 public void setUserInfo(int seq,int userAge,String userName) {
			
	 }
		
	 
	
	
}
