class Solution { 
    public int beautySum(String s) {
        int ans=0;

        for(int i=0;i<s.length();i++){
            int[] f=new int[26];
            for(int j=i;j<s.length();j++){
                f[s.charAt(j)-'a']++;
                int max=0,min=Integer.MAX_VALUE;


                for(int k=0;k<26;k++){
                    if(f[k]>0){
                        max=Math.max(f[k],max);
                        min=Math.min(f[k],min);
                    }
                }

                ans+=(max-min);
            }
        }

        return ans;
    }
}