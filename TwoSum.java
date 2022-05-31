import java.util.HashSet;
/*This Program finds the two numbers in array
 * whose sum is equal to target number.
 * in this problem program will return numbers in array whose sum is 4.
 */
public class TwoSum {
	
	public static int[] twoNum(int[] num ,int target) {
		int[] nums = new int[2];
		HashSet<Integer> a= new HashSet<> ();
		for(int i=0;i<num.length;i++) {
			int requiredNum = target - num[i];
			if(a.contains(requiredNum)) {
				nums[0] = requiredNum;
				nums[1] = num[i];
				return nums;
			}
			else {
				a.add(num[i]);
			}
		}
		
		return nums;
	}

	public static void main(String[] args) {
		int[] num = {3,5,-4,8,11,1,-1,6};
		int target = 4;
		
		int[] numbers = twoNum(num,target); 
		for(int i=0;i<2;i++)
		System.out.print(numbers[i]+" ");
	}

}
