public class Solution {
    public int strSt2r(String haystack, String needle) {
        
        int m = needle.length();
        int n = haystack.length();
        
        for( int i = 0; i+m-1 < n; i++ ) {
            if( haystack.substring(i, i+m).equals(needle) ) return i;
    }
    return -1;
}
}
