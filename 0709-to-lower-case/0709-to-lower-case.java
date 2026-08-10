import java.util.*;
class Solution {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();

        for(int i=0 ; i<chars.length ; i++){
            if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
          return new String(chars);
         // return Array.toString(char);

    }
}