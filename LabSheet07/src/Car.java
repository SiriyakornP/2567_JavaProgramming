
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage; //No setter
	
	Car(){
	/*	companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;*/
		this("Unknown","Unknowm",2000,0.0);
	}
	
	//parameterize constructor
	Car(String companyName, String modelName, int year, double mileage) {
		this.companyName = companyName;
		this.modelName = modelName;
		//default create year 2000 if input wrong word
		this.year = year < 1886? 2000 : year;
		this.mileage = mileage;
	}
	
	//getter and setter method
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}
		else {
			System.out.println("Error: Invalid company name");
		}
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}
		else {
			System.out.println("Error: Invalid model name");
		}
	}
	public String getModelName() {
		return this.modelName;
	}
	
	public void setYear(int year) {
		if(!(year<1886)) {
			this.year = year;
		}
		else {
			System.out.println("Error: Invalid year");
		}
	}
	public int getYear() {
		return this.year;
	}
	
	public double getMileAge() {
		return this.mileage;
	}

	public String showData() { 
		return "Company Name: "+ this.companyName + "\nModel Name: "+ this.modelName +"\nYear: "+ this.year + "\nMileage: "+ this.mileage;
	}
	
	public String toString() {
		return "Company Name: "+ this.companyName + "\nModel Name: "+ this.modelName +"\nYear: "+ this.year + "\nMileage: "+ this.mileage;
	}
	
}
