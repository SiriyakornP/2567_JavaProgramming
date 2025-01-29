import java.util.*;
public class StudentScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom: ");
		int numOfStudent = scan.nextInt();
		//consume newline character
		scan.nextLine();
		//create array of student object
		Student[] students = new Student[numOfStudent];
		//input information for each student
		for(int i =0; i<numOfStudent;i++) {
			//create new student object
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT "+(i+1));
			Line();
			//input student name
			System.out.print("Input student name: ");
			/*String stdName = scan.nextLine();
			students[i].setName(stdName);*/
			students[i].setName(scan.nextLine()); //can be use with String only
			//input score & validate
			while(true) {
				System.out.print("Input student score: ");
				int score = scan.nextInt();				
				scan.nextLine();
				students[i].setScore(score);
				
				if(students[i].checkScore()) {
					break;
				} else {
					System.out.print("Input score, again: ");
				}
			}//end while
			//display list of pass students
			System.out.println("\nLIST OF PASS STUDENTS(>=50): ");
			Line();
		}//end for1
		for(Student student : students) {
			if(student.isPass()) {
				System.out.println(">> "+student.getName()+" ("+student.getScore()+") ");
			}
		}//end for2
		
		scan.close();
	}//end of main()
	
	public static String findGrade(int score) {
		/*return score >= 80? "A" :
			   score <=79 && score>=75? "B+" :
			   score <=74 && score>=70? "B" :
			   score <=69 && score>=65? "C+" :
			   score <=64 && score>=60? "C" :
			   score <=59 && score>=55? "D+" :
			   score <=54 && score>=50? "D" : "F";*/		   
		if (score>=80) return "A";
		else if (score>=76) return "B+";
		else if (score>=70) return "B";
		else if (score>=66) return "C+";
		else if (score>=60) return "C";
		else if (score>=56) return "D+";
		else if (score>=50) return "D";
		else return "F";
	}
	
	public static void Line() {
		for(int i=1;i<=50;i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
