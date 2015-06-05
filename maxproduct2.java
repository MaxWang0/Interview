public class solution{
  public maxproduct2(int nums[]){
    max_p  = 0;
    start = 0;
    end = 0;
    
    for(int i = 0; i < nums.length; i++){
      sum_ = 0;
      for(int j = i; j < nums.length; j++){
        sum_ += nums[j];
        if(sum_ > max_p){
          max_p= sum_;
          start = i;
          end = j;
        }
      }
    }
    system.out.println(nums[i] + " " + nums[j] + " " + max_p);
    return max_p;
  }
}
