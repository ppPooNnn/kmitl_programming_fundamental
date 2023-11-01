import  java.util.Scanner;
class Lab5Q5_4_660261
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count   = 0;
        int start   = 0;
        int n       = sc.nextInt();
        sc.close();
        while (count < n)
        {   
            for(int i = 0; i < 4; i++)
            {
                start = i;
                if(count > 0)
                    start += count;
                for(int k = 20; k > start; k--)
                    System.out.print(" ");
                for(int j = 0; j <= start * 2; j++)
                    System.out.print("*");
                System.out.println();
            }
            count++;
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 19; j++)
                System.out.print(" ");
            for(int k = 0; k < 3; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}