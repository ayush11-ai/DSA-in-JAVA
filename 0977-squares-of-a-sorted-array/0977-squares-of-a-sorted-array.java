class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int l = 0;
        int r = nums.length-1;

        for(int i=nums.length-1;i>=0;i--){
            int l2 = nums[l]*nums[l];
            int r2 = nums[r]*nums[r];

            if(l2>=r2){
                squares[i]=l2;
                l++;
            }
            else{
                squares[i]=r2;
                r--;
            }
        }

        return squares ; 
    } 
}
    