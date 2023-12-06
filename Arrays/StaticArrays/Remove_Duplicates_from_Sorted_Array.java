class Solution {
    public int removeDuplicates(int[] nums) {
int[] newArray = new int[nums.length];
        int p1=0;
 
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                newArray[p1] = nums[i]; // Use assignment operator (=) instead of ==
                System.out.println("a:"+newArray[p1] );
            } else {
                if (newArray[p1] == nums[i]) {
                    // Duplicate found, do nothing
                                    System.out.println("b:"+newArray[p1] );

                } else {
                    p1=p1+1;
                    newArray[p1] = nums[i]; // Use assignment operator (=) instead of ==
                                    System.out.println("c:"+newArray[p1]);

                }
            }
        }
         
              for( int i=0;i<=p1;i++){
                nums[i]=newArray[i];
        }
        
        return p1+1;
    }
}
