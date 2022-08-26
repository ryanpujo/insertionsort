import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {8,7,2,1,9,5,4,3,6};
        int[] result = insertionSort(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] insertionSort(int[] nums) {
        int temp = 0;
        for(int i = 1;i < nums.length;i++) {
            temp = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > temp) {
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = temp;
        }
        return nums;
    }

    
}
