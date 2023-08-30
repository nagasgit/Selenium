package mandatoryHW.RestAssured.CW;

public class PojoClsPetStore {

	/*
	 * "username": "Kishore", "firstName": "Kishore", "lastName": "Kishore",
	 * "email": "Kishore@gmail.com", "password": "Kishore123", "phone": "123456789",
	 * "userStatus": 0
	 */
	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phone;
	private int userStatus;

	public PojoClsPetStore(int id,String username, String firstName, String lastName, String email, String password,
			String phone, int userStatus) {
		// super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.userStatus = userStatus;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public PojoClsPetStore() {
		//super();
	}
	
	

}
