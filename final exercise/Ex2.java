import java.util.Scanner;

class Ex2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input_email = sc.nextLine();
        sc.close();
        String output_email = "";
        int i = 0;
        while(i < input_email.length())
        {
            if(i > 0 && input_email.charAt(i) == 'a' && input_email.charAt(i + 1) == 't' && i + 1 < input_email.length() - 1)
            {
                output_email += "@";
                i += 2;
                continue;
            }
            if(i > 0 && input_email.charAt(i) == 'd' && input_email.charAt(i + 1) == 'o' && input_email.charAt(i + 2) == 't' && i + 2 < input_email.length() - 1)
            {
                output_email += ".";
                i += 3;
                continue;
            }
            output_email += input_email.charAt(i);
            i++;
        }
        System.out.println(output_email);
    }
}