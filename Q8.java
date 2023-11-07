public class Q8 {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,7};

        for(int i = 0;i<nums.length;i++){
            for(int j = 1; j<nums.length -1;i++){
            if(nums[i] < nums[i-1]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
            }
            

        }
    }
}
