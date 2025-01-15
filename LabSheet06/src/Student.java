
public class Student {
	private String name;
	private double[] scores;
	
	public void setStudentDetails(String stdName,double[] stdScores) {
		name = stdName;
		scores = stdScores;
	}
	
	public double calculateAverageScore() {
		double total = 0;
		/*for(int i=0;i<scores.length;i++) {
			total += scores[i];
		}*/
		for(double _score : scores) {
			total += _score;			
		}
		return total/scores.length; //return average of scores
	}
	
	public String getGrade() {
		double average = calculateAverageScore();
		if(average>=90) {
			return "A";
		}else if (average>=80) {
			return "B";
		}else if (average>=70) {
			return "C";
		}else if (average>=60) {
			return "D";
		}else {
			return "F";
		}
	}
	
	public void displayStudentDetails() {
		System.out.println("Name: "+name);
		System.out.print("Scores: ");
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]+" ");
		}
		System.out.println("Average Score: "+ calculateAverageScore());
		System.out.println("Grade: "+ getGrade());
	}

}
