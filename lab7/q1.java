class q1
{
    public static void main(String[] args)
    {
        int fact = factorial(4);
        System.out.println(fact);
        fact = factorial(6);
        System.out.println(fact);
    }
    static int factorial(int n)
    {
        int ans = 1;
        for(int i = 1; i <= n; i++)
            ans *= i;
        return ans;
    }
}