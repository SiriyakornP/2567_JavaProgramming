import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		Scanner input = new Scanner(System.in);
		
		PrintWriter writeFile = new PrintWriter(new FileWriter("src//txtFiles//employee.txt",true));
		String answer;
		do {
			super.header();
			//รับข้อมูลชื่อกับแผนกทาง keyboard
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept = input.next();
			//บันทึกจ้อมูลชื่อกับแผนกในไฟล์ที่กำหนดไว้
			writeFile.println(name+","+dept);			
			System.out.print("Do you want to input data again?: ");
			answer = input.next();
		} while(answer.equalsIgnoreCase("Y"));
	}//end insert()
	
	public void searchData() throws IOException{
		try {
			//ใช้คลาส Scanner สำหรับเปิดอ่านไฟล์
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+")"+ name);
					check = true;					
				}
			}//end while	
			if(check) {
				super.header();
				System.out.print("Employee in dept "+ super.getDept()+
						" is "+ i +" person(s).");
				System.out.println();
				super.header();
			}
			else {
				System.out.println("\nSorry, no dept: "+super.getDept()+
						" in file.");
			}//end while
			
		}catch(IOException e) {
			System.out.print("\nSorry, File not found...");
		}
	}
}
