import java.util.*;
public class Lab508 {

	public static void main(String[] args) {
		
		int[] nums = {25,78,41,22,36,85,37};
		Scanner scan = new Scanner(System.in);
		
		int index;
		do {
			System.out.print("Input index of array: ");
			index = scan.nextInt();
			if (!checkIndex(nums, index)) {
				System.out.println("Invalid index. Please input again.");
			}//end if
		} while (!checkIndex(nums, index));
		
		System.out.println("Current data, nums["+index+"] is "+currentData(nums, index));
		System.out.println("Previous data, nums["+(index-1)+"] is "+prevData(nums, index));
		System.out.println("Next data, nums["+(index+1)+"] is "+nextData(nums, index));

	}//end main()
	
	public static boolean checkIndex(int[] nums, int index) {
		return index>=0 && index<nums.length;
	}//end check
	
	public static int currentData(int[] nums, int index) {
		return nums[index];
	}//end current
	
	public static int prevData(int[] nums, int index) {
		return index > 0? nums[index-1] : -1;
	}//end prev
	
	public static int nextData(int[] nums, int index) {
		return index < nums.length -1? nums[index+1] : -1;
	}//end next

}
