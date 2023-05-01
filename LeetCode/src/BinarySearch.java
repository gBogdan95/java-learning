public class BinarySearch {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > nums[mid])
                start = mid + 1;
            else if(target < nums[mid])
                end = mid - 1;
            else
                return mid;
        }
        return start;
    }

    public static void main(String args[]){
        BinarySearch b1 = new BinarySearch();
        System.out.println(b1.searchInsert(new int[]{1,3,5,6},2));
    }
}
