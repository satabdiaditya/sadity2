/*Given an array with positive and negative numbers, find the maximum average subarray of given length.
 * 
 * Input:  arr[] = {1, 12, -5, -6, 50, 3}, k = 4
Output: Maximum average subarray of length 4 begins
        at index 1.
Maximum average is (12 - 5 - 6 + 50)/4 = 51/4

The implementation shown here is not efficient. dynamic programming can be used.Read how from glassdoor
 */

package coding;

public class MaxSubarray {
	
	public static void main(String[] args){
		 int[] arr = {1, 12, -5, -6, 50, 3};
		 int k = 4;
		 
		 int max = maxSubArr(arr, k);
		// System.out.println("The maximum is :" + max);
	}
	
	public static int maxSubArr(int[] arr,int k){
		int max = 0;
		for(int i = 0; i<=(arr.length-k);i++){
			int sum = 0;
			int avg = 0;
			for(int j = i; j < i+k ; j++){
				sum = sum + arr[j];
				}
			//System.out.println(sum);
			avg = sum/k;
			//System.out.println(avg);
			if (avg>max) max = avg;
			// System.out.println("The maximum is :" + max);
		}
		// System.out.println("The maximum is :" + max);
		return max;
	}

}
