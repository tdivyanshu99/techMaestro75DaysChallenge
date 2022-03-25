class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1) return 0;
        int n=nums.length;
        int[] cum=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            if(left==sum-(left+nums[i])) return i;
            left+=nums[i];
        }
        return -1;
    }
}