public class Lab4Q4_660261 
{
    public static void main(String[] args)
    {
        int k, sum, num;
        k = Integer.parseInt(args[0]);
        num = 1;
        sum = 0;
        int check = 0;
        for(num = 1; num < Integer.MAX_VALUE; num++)
        {
            for(int j = 1; j <= num / 2; j++)
            {
                if(num % j == 0)
                    sum += j;
            }
            if(sum == num)
            {
                System.out.println(sum);
                check++;
                if(check == k)
                    break;
            }
            sum = 0;
        }
    }
}