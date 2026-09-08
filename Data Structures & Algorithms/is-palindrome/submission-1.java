class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>='0' && ch<='9'))
                s1+=ch;
        }
        for(int i=0;i<s1.length()/2;i++){
            char ch = Character.toLowerCase(s1.charAt(i));
            char ch1 = Character.toLowerCase(s1.charAt(s1.length()-i-1));
            if(!(ch1==ch))
                return false;
        }
        return true;
    }
}
