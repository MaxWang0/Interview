public class Solution {
    public int maxProduct(int[] nums) {
      if(nums == null || nums.length = 0) return 0;
      
      int max_p = nums[0];
      
      int _sum = 0;
      
      for( int i = 0; i < nums.length-1; i++){
        _sum += nums[1];
        if(_sum> max_p){
          max_p = _sum;
        }
      }
      _sum = 0;
      for (int j = nums.length-1; j > 0; j-- ){
        _sum += nums[j];
        if(_sum > max_p ){
          max_p = _sum;
        }
      }
      
      return max_p;
      
    }
}
