public class Lab4Q3_660261 
{
    public static void main(String[] args)
    {
        int amountCharge = 0;
        int hrsPark = 0;
        int temp = 0;
        for(int i = 0; i < args.length; i++)
        {
            hrsPark = Integer.parseInt(args[i]);
            temp = hrsPark;
            while(temp >= 0)
            {
                if(temp <= 2)
                {
                    amountCharge += 4;
                    temp--;
                    break;
                }
                else if(temp > 2 && temp <= 4)
                {
                    amountCharge += 3;
                    temp--;
                }
                else if(temp > 4 && temp < 24)
                {
                    amountCharge += 1;
                    temp--;
                }
                else if(temp >= 24)
                {
                    amountCharge += 24;
                    temp -= 24;
                }
            }
            if(hrsPark < 24 && amountCharge > 24)
                amountCharge = 24;
            System.out.println("Park Fare of car" + (i + 1) + " is " + amountCharge);
            amountCharge = 0;
        }
    }
}
