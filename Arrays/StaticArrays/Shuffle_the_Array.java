class Solution {
    public int removeElement(int[] nums, int val) {
        int record =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[record]=nums[i];
                record++;
            }
        }
        return record;
    }
}
