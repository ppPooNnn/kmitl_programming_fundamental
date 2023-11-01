class test
{
    public static void main(String[] args)
    {
        int n = 3;
        for(int i = 0; i <= n; i++)
        {
            System.out.print(x2(i) + ", ");
        }
    }

    static int fibo(int n)
    {
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    static int x2(int n)
    {
        if(n == 0)
            return 1;
        return 2 * x2(n - 1);
    }
}