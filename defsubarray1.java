//Given two array find if one array is subarray of the other.(Defn of subarray : should contain all the elements in any order)
public class Solution{
  public int defsubarray1(int[] nums1, int[] nums2){
    m = nums1.length;
    n = nums2.length;
    if(m>n){
       for(int i = 0; i < m; i++){
         for(int j = 0; j < n; j++){
           if(nums1[i] == nums2[j]) break;
         }
         if (j==m) return 0;
       }
       return 1;
    }else{
      for(int i = 0; i < n; i++){
         for(int j = 0; j < m; j++){
           if(nums1[j] == nums2[i]) break;
         }
         if (j==m) return 0;
       }
       return 1;
    }
   
  }
}
