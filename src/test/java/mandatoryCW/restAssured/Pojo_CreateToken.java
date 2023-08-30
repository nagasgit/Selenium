package mandatoryCW.restAssured;

public class Pojo_CreateToken 
{
	private String username;
	private String password;
	
	public Pojo_CreateToken(String username, String password) 
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
}
