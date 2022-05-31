import java.util.Scanner;

public class KadnesAlgorithm {
	/*
	 * largest sum of longest subsequence 
	 */
	public static int maxSumArray(int[] arr) {
		int maxSum = 0;
		int currSum = 0;
		for(int i=0;i<arr.length;i++) {
			currSum = currSum + arr[i];
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements in array:");
		int n = scan.nextInt();
		int[] numbers = new int[n];
		for(int i = 0;i<n;i++) {
			numbers[i] = scan.nextInt();
		}
		int sum =maxSumArray(numbers);
		
		System.out.println(sum);

	}

}
