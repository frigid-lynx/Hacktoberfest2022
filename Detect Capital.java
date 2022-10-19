// Problem Link: https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1) 
            return true;
        boolean big=false, small=false,firstCapital=false;
        
        if(word.charAt(0)>=65 && word.charAt(0)<=90) 
            firstCapital=true;
        word=word.substring(1);
        for(int i=0;i<word.length();i++) {
            if(word.charAt(i)>=65 && word.charAt(i)<=90)
                big=true;
            if(word.charAt(i)>=97 && word.charAt(i)<=122)
                small=true;
            if(small && big) 
                return false;
        }
        if(firstCapital && (small || big)) 
            return true;
        if(small) 
            return true;
        return false;
    }
}
