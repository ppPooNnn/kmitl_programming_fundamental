import  java.util.Scanner;

class Lab4Q1_2660261 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        while(x > 0)
        {
            x = sc.nextInt();
            if (x % 2 == 0)
                sum = sum + x;
        }
        System.out.println("Sum of even numbers is " + sum);
        sc.close();
    }
}
