public class 53 {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        int i;
        for ( i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}


public class 53 {
    public int maxSubArray(int [] nums){
        int max = nums[0];
        for(int i =0; i<nums.length; i++){
            int sum =0;
            for(int j = i; j<num.length;j++){
                sum += nums[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
    }
}