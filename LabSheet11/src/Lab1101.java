import java.util.*;
import java.io.*;
public class Lab1101 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		System.out.print("Input Section : ");
		int section = input.nextInt();
		
		printHeader(section);
		displayStudentList(section);
		
	}//end main()
	
	public static void printHeader(int sec) {
		System.out.println("**********************************************");
		System.out.println("\t\tList of Data for Section " + sec);
		System.out.println("**********************************************");
	}//end of printHeader()
	
	public static void displayStudentList(int sec) throws IOException {
		try (BufferedReader readFile = new BufferedReader(new FileReader("src//txtFiles//List107.txt"))) {
			String temp = "";
			while((temp = readFile.readLine()) != null) {
				String[] data = temp.split("\t");
				
				if(data.length < 6) continue;
				
				int studentSection = Integer.parseInt(data[3]); //แปลงกลุ่มเรียนใมนไฟล์ให้เป็น int
				
				if(studentSection==sec) {
					double midTerm = Double.parseDouble(data[4]);
					double finalScore = Double.parseDouble(data[5]);
					System.out.printf("%s %s\t%s\t%s \t%s%n" , data[0], data[2],midTerm,finalScore,determineResult(midTerm,finalScore));
					
				
				}
			}//end while
		}//end try
	}//end displayStudentList()
	
	public static String determineResult(double mid,double fin) {
		return (mid+fin) <= 40? "Fail" : "Pass";
	}//end determineResult()

}
