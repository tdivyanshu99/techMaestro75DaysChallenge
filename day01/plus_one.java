class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int[] ar=new int[n+1];
        
        int i=n-1;
        int a=digits[i]+1;
        int rem=a%10;
        int carry=a/10;
        ar[i+1]=rem;
        i=n-2;
        while(i>=0){
            int rt=digits[i]+carry;
            int ans=rt%10;
            carry=rt/10;
            ar[i+1]=ans;
            i--;
        }
        
        if(carry>0){
          ar[0]+=carry;
            return ar;
        } 
        int j=0;
        int art[]=new int[n];
        if(ar[j]==0) {
            j++; 
            int p=0;
            for(int l=j;l<=n;l++){
                art[p]=ar[l];
                p++;
            }
        } 
        
        
        //for(int k=0;k<n+1;k++) System.out.println(ar[i]);
        
        return art;
         
    }
}