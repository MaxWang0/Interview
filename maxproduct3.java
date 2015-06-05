public class Solution{
  public maxproduct(int[] nums){
    max_p = 0;
    start = 0;
    end = 0;
    int temp = 0;
    sum_ = nums[0];
    for (int i = 1; i < nums.length; i++){
      if ( sum_ < 0 ){
        max_p = nums[i];
        temp = nums[i];
      }
      else{
        sum_ += nums[i];
      }
      
      if( sum_ > max_p){
        max_p = sum_;
        start = temp;
        end = nums[i]
      }
    }
    system.out.println(start + " " + end + " " + max_p);
    return max_p;
  }
}
