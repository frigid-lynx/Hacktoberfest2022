class Solution {
    public void reverseString(char[] s) {
       
        for(int a=0; a<(s.length)/2; a++){
             char t = s[s.length-1-a];
             s[s.length-1-a]  = s[a];
            s[a] = t;
            
        }
      
        
    }
}
