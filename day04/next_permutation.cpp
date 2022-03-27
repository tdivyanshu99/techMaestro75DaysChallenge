class Solution {
    public void nextPermutation(int[] nums) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        while(j>0 && nums[j-1]>=nums[j]) j--;
        
        if(j==0){
            int k=0;
            int l=n-1;
            while(k<l){
                int temp=nums[k];
                nums[k]=nums[l];
                nums[l]=temp;
                k++;
                l--;
            }
        }
        else{
            int p=n-1;
            while(p>j-1 && nums[p]<=nums[j-1]) p--;
            
            int tmp = nums[p];
            nums[p] = nums[j-1];
            nums[j-1] = tmp;
            
            // reverse j--n-1;
            int t=n-1;
            while(j<t){
                int temp=nums[j];
                nums[j]=nums[t];
                nums[t]=temp;
                j++;
                t--;
            }
        }
    }
}