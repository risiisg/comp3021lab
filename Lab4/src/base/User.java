package base;

public class User implements Comparable<User> {

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
		String str = "User [id=" + this.id + ", name=" + this.name + ", email=" + this.email + "]";
		return str;
	}
	
	@Override
	/**
	 * Return hash code of the User
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(User u) {
		if(u.getId() < this.id) {
			return 1;
		}
		if(u.getId() == this.id) {
			return 0;
		}
		return -1;
	}
	
}
