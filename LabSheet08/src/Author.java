
public class Author {
	private String name;
	private String email;
	
	//default const
	Author(){
		this(null,null);
	}
	
	//parameterize const
	Author(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	//set get
	
	public void setName() {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail() {
		this.email = email;
	}
	
	public String toString() {
		return getName() + " ("+ getEmail() + ") ";
	}
	
}
