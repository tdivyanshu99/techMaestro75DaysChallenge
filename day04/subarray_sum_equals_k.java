class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap();
        int n=nums.length;
        int sum=0;
        mp.put(0,1);
        int cnt=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(mp.containsKey(sum-k)==true){
                cnt=cnt+mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}