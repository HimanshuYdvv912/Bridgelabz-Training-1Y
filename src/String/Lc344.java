package String;
import java.util.*;

class LC344a {
    public static void main (String []args){
        int left=0;
        int right =s.length-1;
        while (left <right){
            char temp=s[left];
            s[left]= s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
