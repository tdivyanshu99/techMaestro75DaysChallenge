class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cand=-1;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(cand==nums[i]){
                cnt++;
            }
            else if(cnt==0){
                cnt=1;
                cand=nums[i];
            }
            else cnt--;
        }
        return cand;
    }
}