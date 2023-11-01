public class lab3q1_1 
{
    public static void main(String[] args)
    {
        int change, c10, c5, c1;
        change = 590;
        c10 = 0;
        c5 = 0;
        c1 = 0;
        c10 = change / 10;
        c5 = (change % 10) / 5;
        c1 = (change % 5);
        System.out.println("coin10 = " + c10 + "\ncoin5 = " + c5 + "\ncoin1 = " + c1);
    }
}