
import java.util.*;
public class SMALLstring {
    public static void main(String args[])
    {
        String a="devera";
        int c[]=new int[32];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-97]++;
        }
        System.out.println(Arrays.toString(c));
    
    }
}



