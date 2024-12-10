import java.util.*;
public class ODDSTRINGS {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String res=" ";
        for(int i=1;i<=a.length();i++)
        {
            res+=a.charAt(i);
        }
    System.out.println("res");
    }
}

