package demo.sliding.window;

public class MinimumSizeSubArraySum {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		int s = 11;
		int minSize = minSize(arr, s);
		System.out.println(minSize);
	}

	private static int minSize(int[] nums, int s) {
		int i = 0, j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        if(nums.length == 0)
            return 0;
        
        while(j < nums.length){
            sum += nums[j];
            
            if(sum < s)
                j++;
            
            else if(sum == s){
                min = Math.min(min, j-i+1);
                j++;
            }
            else if(sum > s){
                while(sum > s){
                    sum -= nums[i];
                    i++;
                }if(sum == s){
                    min = Math.min(min, j-i+1);
                    j++;
                }else
                    j++;
            }
        }
        
        if(min == Integer.MAX_VALUE)
            return 0;
        else
            return min;
	}

}
