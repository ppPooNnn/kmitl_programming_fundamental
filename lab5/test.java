import java.util.Scanner;

public class test 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 0;
    int sum = 0;
    int num = 0;
    while(i < n)
    {
      sum = 0;
      num = sc.nextInt();
      for(int j = 0; j < num; j++)
      {
        sum += sc.nextInt();
      }
      System.out.println(sum);
    }
    sc.close();
    }
}
