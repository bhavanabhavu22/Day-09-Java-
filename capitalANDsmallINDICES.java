
import java.util.*;
public class capitalANDsmallINDICES {
    public static void main(String args[])
    {
        String a="AMARAN";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65]++;
        }
        System.out.println(Arrays.toString(c));
          String a1="bhavana";
        int c1[]=new int[26];
        for(int i=0;i<a1.length();i++)
        {
            c1[((int)(a1.charAt(i)))-65]++;
        }
        System.out.println(Arrays.toString(c1));
    }
}
    





    