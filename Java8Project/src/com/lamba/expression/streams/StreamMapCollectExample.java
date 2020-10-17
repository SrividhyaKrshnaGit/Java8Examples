package com.lamba.expression.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamMapCollectExample {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"Sri","password","sri.k@gmail.com"));
		userList.add(new User(2,"vidhya","password","vid.k@gmail.com"));
		userList.add(new User(3,"padma","password","padma.k@gmail.com"));
		userList.add(new User(4,"Padmashri","password","padmashri.k@gmail.com"));
		
		List<UserDto> userDto = new ArrayList<UserDto>();
		
	
		
		System.out.println("Old way of copying one pojo to other ");
		
		for(User user: userList) {
			userDto.add(new UserDto(user.getId(),user.getUserName(),user.getEmail()));
		}
		
		for(UserDto dto :userDto) {
			System.out.println(dto);
		}
		
		System.out.println("New way by stream Map for copying one pojo to another");
		userList.stream().map((user) -> new UserDto(user.getId(),user.getUserName(),user.getEmail()))
		.forEach(System.out::println);
			
	}
}

class UserDto{
	int id;
	String userName;
	String email;
	
	public UserDto(int id, String userName,String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ",email=" + email + "]";
	}
	
}
class User{
	int id;
	String userName;
	String password;
	String email;
	
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}	
}
