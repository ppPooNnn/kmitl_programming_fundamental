import  java.util.Scanner;
class Lab4Q1_1660261
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float   f = sc.nextFloat();
        float   c = ((f - 32) / 9) * 5;
        System.out.println("C from " + f + " is " + c);
        sc.close();
    }
}