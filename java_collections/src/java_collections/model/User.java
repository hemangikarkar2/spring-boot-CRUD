package java_collections.model;
//okay so your next task is to filter user objects based on enable status field
//you can take User Objects with id, status firstName, lastName fields
//and you have to use filter of stream api

public class User {

	private Integer id;
	private String firstName;
	private String lastName;
	public boolean status;
	//Boolean - wrapper type 
	//boolean is called primitive type so you can use isstatus() 
	public User(Integer id, String firstName, String lastName, boolean status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}

	


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", status=" + status + "]";
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public boolean isStatus() {
		return status;
	}




	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	
	
	
	
}
