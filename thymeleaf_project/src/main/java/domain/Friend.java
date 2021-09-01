package domain;


public class Friend {
	
	
	private String friend;
	
	
	public Friend() {
		super();
	}
	

	public Friend(String friend) {
		this.friend = friend;
	}

	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "Friend [friend=" + friend + "]";
	}
	
	
	     
	

}
