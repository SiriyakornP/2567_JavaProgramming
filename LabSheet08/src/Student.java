
public class Student {
	private String studentName;
	private int studentScore;
	
	public void setName(String stdName) {
		studentName = stdName;
	}
	
	public void setScore(int stdScore) {
		studentScore = stdScore;
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getScore() {
		return studentScore;
	}
	
	//score must between 0-100
	public boolean checkScore() {
		/*if(getScore()>=0 && getScore()<=100) {
			return true;
		} return false;*/
		
		return getScore()>=0 && getScore()<=100;
	}
	
	public boolean isPass() {
		return getScore()>=50;
	}
}
