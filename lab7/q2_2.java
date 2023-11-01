import java.util.Scanner;

public class q2_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String sub = sc.next();
        System.out.println(myIndexOf(str, sub, 0));
        sc.close();
    }
    static int myIndexOf(String str, String sub, int idx)
    {
        int offset = 1;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == sub.charAt(0))
            {
                while(i + offset < str.length() && offset < sub.length() && str.charAt(i + offset) == sub.charAt(offset))
                    offset++;
            }
            if(str.charAt(i) == sub.charAt(0) && offset == sub.length())
                return i;
        }
        return -1;
    }
}
