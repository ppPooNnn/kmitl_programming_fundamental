public class Lab5Q4_1_660261 
{
    public static void main(String[] args)
    {
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int sumW = 0;
        int sumM = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'W')
                sumW++;
            if(str.charAt(i) == 'M')
                sumM++;
        }
        System.out.println("W = " + sumW);
        System.out.println("M = " + sumM);
    }
}
