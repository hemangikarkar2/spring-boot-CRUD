package java_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java_collections.model.User;
import java_collections.model.UserMap;
import java_collections.model.UserMapDTO;

public class StreamMapExample4 {

	public static void main(String[] args) {
		
		List<UserMap> userMap = new ArrayList<UserMap>();
		userMap.add(new UserMap(1, "Hema", "a123", "hkarkar@gmail.com"));
		userMap.add(new UserMap(2, "Reema", "a123", "Reema@gmail.com"));
		userMap.add(new UserMap(3, "Hina", "a123", "Hinar@gmail.com"));
	
		List<UserMapDTO> userDTO  = new ArrayList<>();
		for(UserMap user : userMap){
			userDTO.add(new UserMapDTO(user.getId(), user.getUserName() ,user.getEmail()));
		}
		
		for(UserMapDTO dto : userDTO){
			System.out.println(dto);
		}
		//using stream().map()
		
		
		
	/*			userMap.stream().map(new Function<UserMap, UserMapDTO>() {

			@Override
			public UserMapDTO apply(UserMap user) {
				// TODO Auto-generated method stub
				return new UserMapDTO(user.getId(),user.getUserName(), user.getEmail());
			}
		}) ;
		
	instead of doing this we can use lambda expression 
 		*/
		
	/*	userMap.stream().map((UserMap user) -> 
		UserMapDTO(user.getId(),user.getUserName(), user.getEmail()))
		.forEach((userdto) -> {
			System.out.println(userdto); }  ); 
		
	*/
		//i want to store result into list then use collector
		
		List<Object> userDTO2 = userMap.stream().map((UserMap user) -> 
		UserMapDTO(user.getId(),user.getUserName(), user.getEmail()))
		.collect(Collectors.toList());
		userDTO2.forEach(System.out :: println);
		
	}

	private static Object UserMapDTO(int id, String userName, String email) {
		// TODO Auto-generated method stub
		return new UserMapDTO(id ,userName, email);
	}

}

/* 
public class UserMapDTO {

	private int id;
	private String userName;
	private String email;
	
	
	public UserMapDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserMap [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

public class UserMap {

	private int id;
	private String userName;
	private String password;
	private String email;
	
	
	
	public UserMap(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserMap [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}


*/