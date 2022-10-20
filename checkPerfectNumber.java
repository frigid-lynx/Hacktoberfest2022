class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum =1;
         for(int a=2; a*a<=num; a++){
             
             if(a*a != num){
             if(num%a ==0){
               sum=sum+a+num/a;
             
                 
             }
             }else{
                 sum=sum+a;
             }
           }
        if(num ==sum){
               return true;
             
         }
        
        return false;
    }
}
