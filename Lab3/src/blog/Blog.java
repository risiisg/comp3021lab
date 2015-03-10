package blog;

import java.util.ArrayList;

import base.*;

public class Blog {
	
	private User user;
	private ArrayList<Post> allPosts;
	
	/**
	 * Constructor
	 * @param user
	 */
	public Blog(User user) {
		this.user = user;
		this.allPosts = new ArrayList<Post>();
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * create a new post in your blog
	 * - add p to the ArrayList
	 * - print a message if succeed
	 * @param post p
	 */
	public void post(Post p) {
		boolean success = allPosts.add(p);
		if(success) {
			System.out.println("New post added:");
			System.out.println(p.toString());
		}
	}
	
	/**
	 * list all posts in the blog
	 */
	public void list() {
		System.out.println("Current posts:");
		for(int i=0; i<allPosts.size(); i++) {
			System.out.print("Post[" + (i+1) + "]: ");
			System.out.println(allPosts.get(i).toString());
		}
	}
	
	/**
	 * delete a post from the blog
	 * @param index
	 */
	public void delete(int index) {
		// Is the index legal? The index should be neither to high nor negative
		// If the index is legal, delete the corresponding Post
		// Otherwise print a fault message
		if(index >= 1 && index <= allPosts.size()) {
			allPosts.remove(index-1);
			System.out.println("Post deleted.");
		}
		else {
			System.out.println("Illegal deletion, out of boundary");
		}
	}
	
	@Override
	/**
	 * Output this object in string format
	 * @return String
	 */
	public String toString() {
		String str = "Blog of " + user + "\n";
		for(int i=0; i<allPosts.size(); i++) {
			str += "Post[" + (i+1) + "]: ";
			str += allPosts.get(i).toString();
			if(i != allPosts.size()-1)
				str += "\n";
		}
		return str;
	}


	@Override
	/**
	 * Return hash code of the post
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	/**
	 * Check whether this object equals object obj
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
