class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]ans=new int[nums.length*2];
        int num=0;
        for (int i : nums){
            ans[num]=i;
            ans[num+nums.length]=i;
            num++;
        }
        return ans;
    }
}
