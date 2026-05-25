import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        
        String s="";
        for(int each:digits){
            s+=each;
        }
        BigInteger num=new BigInteger(s);
        num=num.add(new BigInteger("1"));
        String s1=num.toString();
        int nums[]=new int[s1.length()];
        for(int i =0;i<s1.length();i++){
            nums[i]=s1.charAt(i)-'0';
        }
        return nums;
    }
}