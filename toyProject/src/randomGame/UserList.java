package randomGame;

public class UserList {
	
	private int userAge;
	private String userName;
	

	public UserList(int age, String name) {
		super();
		this.userAge = age;
		this.userName = name;	}


	@Override
	public String toString() {
		return "UserList [userAge=" + userAge + ", userName=" + userName + "]";
	}

	
}
