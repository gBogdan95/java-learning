public class RemoveElement {

    static void removeElement(int[] nums, int val){
        int [] newNums = new int[nums.length];
        int k=0;
        for(int i=0;i< nums.length;i++)
            if(nums[i] != val){
                newNums[k] = nums[i];
                k++;
            }
        for(int i=0;i<k;i++)
            System.out.print(newNums[i]);
    }

    public static void main(String args[]){
        int nums [] = {0,1,2,2,3,0,4,2};
        removeElement(nums,2);
    }
}
