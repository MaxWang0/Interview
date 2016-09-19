class Solution{
    public List<List<String>> anagram(String[] str){
           List<List<String>> res = new ArrayList<>();
           
           Set<String> set = new HashSet<>();
           for(int i = 0; i < str.length-1;i++){
              if(set.contains(str[i])) continue;
              List<String> list = new ArrayList<>();
              list.add(str[i]);
              set.add(str[i]);
               for(int j = i+1; j< str.length;j++){
               if(!set.contains(str[j])){
                   if(compare(str[i],str[j])){
                      set.add(str[j]);
                      list.add(str[j]);
                   }
               }
           }
           res.add(list);
        }
        return res;
    }
    
    public boolean compare(String str1, String str2){
          if(str1.length()!=str2.length()) return false;
          int diff =(str2.charAt(0)-str1.charAt(0))%25;
          for(int i = 1; i < str1.length();i++){
                 if((str2.charAt(0)-str1.charAt(0))%25!=diff) return false;
          }
          return true;
    }
}
