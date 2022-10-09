class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> li = new ArrayList<Integer>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            
            while(nums[i]!=i+1&&nums[i]!=nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1]=temp;
            }
        }
        
        
        for(int i=0;i<n;i++){
       
            if(nums[i]!=i+1){
                li.add(i+1);
            }
        }
        return li;
    }
}