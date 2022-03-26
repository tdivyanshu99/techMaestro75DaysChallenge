class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n=intervals.size();
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> ans;
        ans.push_back(intervals[0]);
        for(int i=1;i<n;i++){
            
            if(intervals[i][0]>=ans[ans.size()-1][0] && intervals[i][0]<=ans[ans.size()-1][1]){
                int maxi = max(intervals[i][1],ans[ans.size()-1][1]);
                ans[ans.size()-1] = {ans[ans.size()-1][0],maxi};
            }
            else{
              
                ans.push_back(intervals[i]);
            } 
        }
        return ans;
    }
};