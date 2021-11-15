package Assignment;
import java.util.*;
public class IntersectionOfTwoArray {
	
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set= new HashSet<>();
        List<Integer> res= new ArrayList<>();
        
        for(int num:nums1)
            set.add(num);
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
       // int arr[]=res.toArray();
        //for(int obj:arr)
         //   return obj;
        return res.stream().mapToInt(i->i).toArray();
    }
}
