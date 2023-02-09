package randomGame;

public class GameController {
//	참여 인원을 입력 받음
//	인원 수 만큼 정보를 입력받아 객체 생성 (나이와 이름)
//	게임을 선택
//	선택한 게임의 객체와 인트로 객체 생성
//	~~게임진행~~
//	게임 종료후 게임 선택 및 게임 순서 정렬
//	한명이 꽐라가 될 때 까지 게임을 진행
	
	
	public static void main(String[] args) {
		GameManager gm = new GameManager();
		int headCount = gm.userCounter(); //참여자수 입력받음
		gm.createUser(headCount); //참여자수 만큼 객체생성
		
		System.out.println();
	}
	
	
	
	
}
	 
	 
	

