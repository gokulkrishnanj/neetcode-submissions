class Solution {
    public boolean validPalindrome(String s) {
        boolean firstCheck = firstCheck(s);
        boolean secondCheck = secondCheck(s);
        return firstCheck || secondCheck;
    }

    public static boolean firstCheck(String s){
        int start=0, end= s.length()-1, count=0;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                if(count==1)
                    return false;
                count++;
                start++;
            }
        }
        return true;
    }

    public static boolean secondCheck(String s){
        int start=0, end= s.length()-1, count=0;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                if(count==1)
                    return false;
                count++;
                end--;
            }
        }
        return true;
    }

}