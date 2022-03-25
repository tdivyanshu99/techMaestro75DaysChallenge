class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int ar[]=new int[2];
        for(int i=0;i<n;i++){
            if(mp.containsKey(target - nums[i])==true){
                ar[0]=i;
                ar[1]=mp.get(target-nums[i]);
                return ar;
            }
            else mp.put(nums[i],i);
        }
        return ar;
    }
}