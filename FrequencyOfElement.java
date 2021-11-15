package Assignment;

//			Find the frequency of an element in a sorted array with duplicates present. 
//			for eg: [1,1,2,2,4,5,5,6,6,6,6,9,10,11] and target = 6 
//			O/P: 4 

public class FrequencyOfElement {
	
	static int binarySearch(int arr[], int l,
            int r, int x)
		{
		if (r < l)
			return -1;
		
		int mid = l + (r - l) / 2;
		if (arr[mid] == x)
			return mid;
		if (arr[mid] > x)
			return binarySearch(arr, l,
		                mid - 1, x);
		return binarySearch(arr, mid + 1, r, x);
		
		}
	
		static int countOccurrences(int arr[],
		                int n, int x)
		{
		int ind = binarySearch(arr, 0,
		               n - 1, x);
		
		if (ind == -1)
		return 0;
		
		// Count elements on left side.
		int count = 1;
		int left = ind - 1;
		while (left >= 0 &&
			arr[left] == x)
			{
			count++;
			left--;
			}
		
		// Count elements on right side
		int right = ind + 1;
		while (right < n &&
			arr[right] == x)
			{
			count++;
			right++;
			}
		
		return count;
		}

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int n = arr.length;
		int target = 6;
		System.out.print(countOccurrences(arr, n, target));
	}
}
