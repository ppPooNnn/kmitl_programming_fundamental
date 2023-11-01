import java.util.Scanner;

public class q2_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String sub1 = sc.next();
        String sub2 = sc.next();
        System.out.println(containsAndBefore(input, sub1, sub2));
        sc.close();
    }

    static boolean containsAndBefore(String input, String sub1, String sub2)
    {
        int whereSub1 = myIndexOf(input, sub1, 0);
        int whereSub2 = myIndexOf(input, sub2, 0);
        if(whereSub1 != -1 && whereSub2 != -1 && whereSub1 < whereSub2)
            return true;
        return false;
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
