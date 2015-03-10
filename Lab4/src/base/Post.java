package base;

import java.util.Date;

public class Post implements Comparable<Post>{
	
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
		String str = this.date + "\n" + this.content;
		return str;
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
		hashCode = 7 * this.date.hashCode() + this.content.hashCode();
		return hashCode;
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
		if(o == this) {
			return true;
		}
		if(o != null) {
			if(o.getClass() == this.getClass()) {
				Post post = (Post) o;
				if(post.getDate().equals(this.date) && post.getContent().equals(this.content)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Check whether this post contains some keyword
	 * @param keyword
	 * @return boolean
	 */
	public boolean contains(String keyword) {
		for(int i=0; i<=(this.content.length()-keyword.length()); i++) {
			if(this.content.substring(i, i+keyword.length()).equals(keyword)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Post p) {
		return this.date.compareTo(p.getDate());
	}
	
}