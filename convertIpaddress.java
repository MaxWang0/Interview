class Solution{
    public convertIpaddress(int num){
         int first = num>>24;
         int second = (num<<8)>>24;
         int third = (num<<16)>>24;
         int forth = (num<<24)>>24;
         return Integer.toString(first)+"."+Integer.toString(second)+"."+Integer.toString(third)+"."+Integer.toString(forth);
    }
}
