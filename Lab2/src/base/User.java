package base;

public class User {

	private int id;
	private String name;
	private String email;
	
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param email
	 */
	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
		System.out.println(this);
	}

	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	/**
	 * Output this object in string format
	 * @return String
	 */
	public String toString() {
		String str = "User [id=" + this.getId() + ", name=" + this.getName() + ", email=" + this.getEmail() + "]";
		return str;
	}
	
	@Override
	/**
	 * Check whether this object equals object o
	 * - check if object is null
	 * - check if they are same class
	 * - check the variables: id
	 * @param object o
	 * @return boolean
	 */
	public boolean equals(Object o) {
		if(o != null) {
			if(o instanceof User) {
				User user = (User) o;
				if(user.getId() == this.getId()) {
					return true;
				}
			}
		}
		return false;
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
		hashCode = 7 * name.hashCode() + email.hashCode();
		return hashCode;
	}
	
}
