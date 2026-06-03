class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = 0;
        for ( int i = 0; i< nums.length;i++){
            for ( int j = i; j<nums.length;j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum = sum+nums[k];
                }
                if(sum >maxsum){
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }
}