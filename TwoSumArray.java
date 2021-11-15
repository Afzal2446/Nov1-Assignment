package Assignment;

//		Input: numbers = [2,7,11,15], target = 9
//		Output: [1,2]
//		Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

public class TwoSumArray {
	
	static int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while(low<high){
            int sum=numbers[low]+numbers[high];
            if(sum==target){
                return new int[]{low+1,high+1};
            }
            else if(sum>target){
                high--;
            }
            else
                low++;
        }
        return new int[]{};
    }
}
