
public class Barista {
	public String name;
	public char gender;
	
	Barista(String name,char gender){
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGenderName() {
		if(gender=='M') {
			return "Male";
		}else if(gender=='f') {
			return "Female";
		}else {
			return " ";
		}
	}
}
