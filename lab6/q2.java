import java.util.Scanner;
public class q2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String magnet = sc.nextLine();
        String[] tokens = magnet.split(" ");
        int group = 1;
        for (int i = 0; i < tokens.length - 1; i++)
        {
            //if((Integer.parseInt(tokens[i]) != Integer.parseInt(tokens[i + 1])))
            if(!(tokens[i].equals(tokens[i + 1])))
            {
                //System.out.println(tokens[i] + " and " + tokens[i - 1]);
                group++;
            }
            // else
            //     group++;
        }
        System.out.println(group);
        sc.close();
    }
}
