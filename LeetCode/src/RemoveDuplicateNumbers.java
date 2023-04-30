import java.util.Arrays;

public class RemoveDuplicateNumbers {
        public static void main(String args[]){
            int [] nums = {2,2,5,5,3,3,3,1,1};
            Arrays.sort(nums);
            int [] nums2 = new int[nums.length];
            nums2[0] = nums[0];
            int k=1;
            for(int i=0;i<nums.length-1;i++)
                if(nums[i] < nums[i+1]){
                    nums2[k] = nums[i+1];
                    k++;
                }

            for(int i=0;i<k;i++)
                    System.out.print(nums2[i] + " ");
        }
}
