import  java.util.Scanner;

public class Lab4Q2_660261 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[]   a = new int[3];
        int     min = 0;
        int     sum = 0;
        for (int i = 0; i < 3; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        min = a[0];
        for (int i = 0; i < 3; i++)
        {
            if (min > a[i])
                min = a[i];
        }
        sum -= min;
        System.out.println("Sum of two larger numbers is " + sum);
        sc.close();
    }
}
