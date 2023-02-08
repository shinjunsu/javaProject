package randomGame;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GameController gc = new GameController(); 
		gc.gameStart();
		Scanner in = new Scanner(System.in);
		gc.setHeadCounter(in.nextInt());
		System.out.println(gc.getHeadCounter());
		gc.setUserInfo();
		
		
	}

}
