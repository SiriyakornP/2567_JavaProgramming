import javax.swing.JOptionPane;

public class Lab507 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		for(int i =0; i<nums.length; i++) {
			String input = JOptionPane.showInputDialog("Input number"+(i+1)+":");
			nums[i] = Integer.parseInt(input);
		}
		
		showEven(nums);
		
		showOdd(nums);
	}// end of main()
	
	public static void showEven(int[] nums) {
		String evenNum = "List of even numbers:\n";
		for(int _nums : nums) {
			if (_nums%2==0) {
				evenNum += _nums+" ";
			}
		}//end for
		JOptionPane.showMessageDialog(null, evenNum);
	}//end even
	
	public static void showOdd(int[] nums) {
		String oddNum = "List of odd numbers:\n";
		for(int _nums : nums) {
			if (_nums%2!=0) {
				oddNum += _nums+" ";
			}
		}//end for
		JOptionPane.showMessageDialog(null, oddNum);
	}

}
