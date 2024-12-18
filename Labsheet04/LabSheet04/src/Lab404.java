import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		
		inputStudent();	
		
	}//end main()
	
	public static void inputStudent() {
		Scanner input = new Scanner(System.in);
		
		String stuId;
		String subjCode;
		
		while(true) {
			System.out.print("Enter Student ID : ");
			stuId = input.nextLine();
		
			System.out.print("Enter Subject ID : ");
			subjCode = input.nextLine();
			
			isSudentIDValid = isLength(stuId,10);
			isSubjectCode = isLength(subjCode,7);
		
			if(isSudentIDValid && isSubjectCode) {
				boolean isITStudent = isITStudent(stuId);
				boolean isITSubject = isITSubject(subjCode);
				
				displayData(isITStudent,isITSubject);
				break;
			} else {
				System.out.println("");
			}
		
			
		}
	}//end inputStudent()
	
	public static boolean isLength(String input, int len) {
		return input.length() ==len;
	}//end isLength
	
	public static boolean isITStudent(String stuId) {
		if(stuId.indexOf(3, 5)==311) {
			return true;
		}
		return false;
	}//end isITStudent
	
	public static boolean isITSubject(String subjCode) {
		if(subjCode.indexOf(1, 2)==21) {
			return true;
		}
		return false;
	}
	
	public static boolean isStudentIDValid(String stuId) {
		return true;
	}
	
	public static boolean isSubjectCodeValid(String subjCode) {
		return true;
	}

}
