package javaspringexamples.spring.ioc.configuration.annotation;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class User {

	private int id;
	private String fisrtName;
	private String lastName;
	private boolean Accountlocked;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isAccountlocked() {
		return Accountlocked;
	}

	public void setAccountlocked(boolean accountlocked) {
		Accountlocked = accountlocked;
	}
}
