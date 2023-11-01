import java.util.Scanner;

public class q2_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(isRotationOf(str1, str2));
        sc.close();
    }

    static boolean isRotationOf(String str1, String str2)
    {
        String tmp = str1 + str1;
        if(!(myIndexOf(tmp, str2, 0)))
            return false;
        return true;
    }

    static boolean myIndexOf(String str, String sub, int idx)
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
                return true;
        }
        return false;
    }
}
