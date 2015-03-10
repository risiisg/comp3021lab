package base;

import java.util.Date;

public class Post {
	
	private Date date;
	private String content;
	
	/**
	 * Constructor
	 * @param date
	 * @param content
	 */
	public Post(Date date, String content) {
		this.date = date;
		this.content = content;
	}
	
	public Date getDate() {
		return this.date;
	}

	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	/**
	 * Output this object in string format
	 * @return String
	 */
	public String toString() {
		String str = "[" + this.getDate() + "] " + this.getContent();
		return str;
	}
	
	@Override
	/**
	 * Check whether this object equals object o
	 * - check if object is null
	 * - check if they are same class
	 * - check the variables: date, content
	 * @param object o
	 * @return boolean
	 */
	public boolean equals(Object o) {
		boolean ans = false;
		
		if(o != null) {
			if(o.getClass() == this.getClass()) {
				Post post = (Post) o;
				if(post.getDate().equals(this.getDate()) && post.getContent().equals(this.getContent())) {
					ans = true;
				}
			}
		}
		return ans;
	}
	
	@Override
	/**
	 * Return hash code of the post
	 * - must be repeatable
	 * - must be consistent with equality
	 * - should be distinct
	 * Using prime number * default hashcode
	 * @return int
	 */
	public int hashCode() {
		int hashCode = 0;
		hashCode = 7 * this.getDate().hashCode() + this.getContent().hashCode();
		return hashCode;
	}
	
	/**
	 * Check whether this post contains some keyword
	 * @param keyword
	 * @return boolean
	 */
	public boolean contains(String keyword) {
		for(int i=0; i<=this.content.length()-keyword.length(); i++) {
			if(this.getContent().substring(i, i+keyword.length()).equals(keyword)) {
				return true;
			}
		}
		return false;
	}
}