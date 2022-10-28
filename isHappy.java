class Solution {
    public boolean isHappy(int n) {
        boolean b  = false;
            int sum = 0;
           if (n == 1 || n == 7){ System.out.println(n);   b=true;
                                return b;}
           else  if( ((n>=2)&&(n<7)) || ((n>=8)&&(n<10)) || (n<=0)){
            // break;   
            System.out.println(n);
           return false;
        } 
        
         else{
            ArrayList <Integer> arr  = new ArrayList<>();
        
            while ( n>0){arr.add(n%10); n = n/10; }
            for(int c=0; c<arr.size(); c++){ sum+= (arr.get(c))*(arr.get(c));  }
             System.out.println(sum);
          return  isHappy(sum);
         }
            
    
      
    }
}
