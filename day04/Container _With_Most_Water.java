class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int maxi=0;
        while(i<j){
            if(height[i]<height[j]){
                maxi=Math.max(maxi,(j-i)*height[i]);
                i++;
            }
            else{
                maxi=Math.max(maxi,(j-i)*height[j]);
                j--;
            }
        }
        return maxi;
    }
}