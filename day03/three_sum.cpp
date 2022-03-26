class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        int i=0;
        int j=1;
        int k=nums.size()-1;
        while(i<n){
            if(i>0 && nums[i]==nums[i-1]){
              i++;
                continue;
            } 
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    ans.push_back({nums[i],nums[j],nums[k]});
                    while(j<n-1 && nums[j]==nums[j+1]) j++;
                    while(k>j+1 && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else k--;
            }
            i++;  
        }
        return ans;
    }
};