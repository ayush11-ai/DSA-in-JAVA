class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false ; 
        }

        int original = x ;

        int z = 0 ;

        while(x>0){
        z = z*10 + x%10;  
        x = x/10;
        } 
    

    if(original==z){
        return true;
    }

    return false;
    }
}