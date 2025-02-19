
public class Drink {
	public int type;
	public char size;
	
	Drink(int type,char size){
		this.type = type;
		this.size = size;
	}
	
	Drink(){
		this.type = 0;
		this.size = 'S';
	}
	
	public String getTypeName() {
		switch(type) {
		case 1:
			return "Hot";
		case 2:
			return "Cold";
		default:
			return null;
		}
	}
	
	public int getTypePrice() {
		switch(type) {
		case 1:
			return 10;
		case 2:
			return 20;
		default:
			return 0;
		}
	}
	
	public String getSizeName() {
		switch(Character.toUpperCase(size)) {
		case 'S':
			return "Small";
		case 'M':
			return "Medium";
		case 'L':
			return "Large";
		default:
			return null;
		}
	}
	
	public int getSizePrice() {
		switch(Character.toUpperCase(size)) {
		case 'S':
			return 15;
		case 'M':
			return 20;
		case 'L':
			return 25;
		default:
			return 0;
		}
	}
	
	public int getTotalPrice() {
		return getTypePrice() + getSizePrice();
	}
}
