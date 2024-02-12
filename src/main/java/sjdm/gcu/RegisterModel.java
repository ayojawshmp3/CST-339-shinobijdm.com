package sjdm.gcu;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegisterModel {
	
	@NotNull(message="First name is a required field.")
	@Size(min=1, max=32, message="Must be between 1 and 32 characters.")
	private String firstName;
	
	@NotNull(message="Last name is a required field.")
	@Size(min=1, max=32, message="Must be between 1 and 32 characters.")
	private String lastName;
	
	@NotNull(message="Email is a required field.")
	@Size(min=1, max=64, message="Must be between 1 and 64 characters.")
	private String email;
	
	@NotNull(message="Phone number is a required field.")
	@Size(min=1, max=32, message="Must be between 1 and 32 characters.")
	private String phoneNumber;
	
	@NotNull(message="User name is a required field.")
	@Size(min=1, max=32, message="Must be between 1 and 32 characters.")
	private String username;
	
	@NotNull(message="Password is a required field.")
	@Size(min=1, max=32, message="Must be between 1 and 32 characters.")
	private String password;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
