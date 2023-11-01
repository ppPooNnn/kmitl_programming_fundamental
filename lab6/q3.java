import java.util.Scanner;
public class q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tokens = str.split("MI");
        for(int i = 0; i < tokens.length; i++)
        {
            if(i < tokens.length - 1)
                System.out.print(tokens[i] + "CSP");
            else
                System.out.print(tokens[i]);
        }
        sc.close();
    }
}
