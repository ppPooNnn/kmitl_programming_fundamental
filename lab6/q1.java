import java.util.Scanner;
class q1
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        int check = 1;

        for( int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0;i < n; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                check = 0;
                break;
            }
        }
        if(check == 0)
            System.out.println("false");
        else
            System.out.println("ture");
        sc.close();
    }
}