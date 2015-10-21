
public class HelloUser {
	
	public String userName;
	
	public HelloUser(String newName)
	{
		userName = newName;
	}
	
	public void greetUser()
	{
		System.out.println("Hello "+userName+ " how are you?");
	}

}
