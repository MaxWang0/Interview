Public class Solution{
  public String reverseWords(String words){
    
    if (words.length() == 0 || words == null) return null;
    
    newstr = words.split("\\s+"); 
    StringBuffer str = new StringBuffer();
    
    for(int i = newstr.length-1; i >= 0, i--){
      str.append(newstr[i])
      str.append(" ");
    }
    
    return str.toString().trim();
  }
}
