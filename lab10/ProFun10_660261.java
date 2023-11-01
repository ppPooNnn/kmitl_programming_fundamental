import java.util.*;

class ProFun10_660261
{
    public static void main(String[] args) 
    {
        int [] data = {1, 2, 3, 2, 4, 2};
        int count = occurrences(data, 2);
        System.out.println(count);


        // int [] a = {1,-2, 3, 4, -5};
        // int [] b = negativesToZero(a);
        // System.out.println(Arrays.toString(b));
    }
    
    public static int occurrences(int [] a, int n)
    {
        int count = 0;
        count = occurrences(a, n, 0, count);
        return count;
    }
    public static int occurrences(int [] a, int n, int idx, int count)
    {
        if (idx == a.length)
            return count;
        if (a[idx] == n)
            count++;
        return occurrences(a, n, idx + 1, count);
    }

    public static int [] negativesToZero(int [] a)
    {
        a = negativesToZero(a, 0);
        return a;
    }
    public static int[] negativesToZero(int [] a, int idx)
    {
        if(idx == a.length)
            return a;
        if(a[idx] < 0)
            a[idx] = 0;
        return negativesToZero(a, idx + 1);
    }
}