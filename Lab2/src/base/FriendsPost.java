package base;

import java.util.Date;

public class FriendsPost extends Post {

	private User friend;
	
	/**
	 * Constructor
	 * @param date
	 * @param content
	 * @param friend
	 */
	public FriendsPost(Date date, String content, User friend) {
		super(date, content);
		this.friend = friend;
	}
	
	public User getFriend() {
		return this.friend;
	}
	
	@Override
	/**
	 * Output this object in string format
	 * @return String
	 */
	public String toString() {
		String str = "[" + this.getDate() + "] Posted by " + this.getFriend().getName() + ": " + this.getContent();
		return str;
	}
	
	@Override
	/**
	 * Check whether this object equals object o
	 * @param object o
	 * @return boolean
	 */
	public boolean equals(Object o) {
		if(o instanceof FriendsPost) {
			FriendsPost friendsPost = (FriendsPost) o;
			if(this.getFriend().equals(friendsPost.getFriend())) {
				if(super.equals(o)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	/**
	 * Return hash code of the post
	 * @return int
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 7 * super.hashCode() + this.getFriend().hashCode();
		return hashCode;
	}
	
}
