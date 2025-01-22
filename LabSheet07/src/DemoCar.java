
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet","Cruze",2009,150000.0);
		System.out.println(car);
		
		//updated car
		NewLine();
		car.setCompanyName("Toyota");
		car.setModelName("Corolla");
		System.out.println(car);
		car.setYear(1800);
		car.setCompanyName("");

	}

	public static void NewLine() {
		System.out.println();
	}
}
