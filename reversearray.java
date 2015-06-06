public class Solution{
  public reversearray(int[] nums){
    for(int i = 0; i < (nums.length-1)/2; i++){
      nums[i] = nums[i] + nums[nums.length - i -1];
      nums[nums.length - i - 1] = nums[i] - nums[nums.length - i -1];
      nums[i] = nums[i] - nums[nums.length - i - 1];
    }
  }
}
