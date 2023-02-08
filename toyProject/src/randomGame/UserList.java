package randomGame;

public class UserList {
	
	
	private String[] sortedUser;
	private int userAge;
	private String userName;
	
	public void setUser() {
		
	}
	
	public String getSortedUser(int seq) {
		return this.sortedUser[seq];
	}
	
	public void soltByUser(int userHeadCounter, int[] userAge , String[] userName) {
		this.sortedUser[0]=userName[0];
		for(int i=0;i<userHeadCounter;i++) {
			if(userAge[i]>userAge[i+1]) {
				this.sortedUser[0]=userName[i+1];
			}
			 
		}
	}	
}
