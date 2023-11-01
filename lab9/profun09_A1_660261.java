import java.util.Arrays;

class profun09_A1_660261
{
    public static void main(String[] args)
    {
        int[] data = {0, 1, 0, 1, 1, 0, 0, 0, 1};
        shake(data);
        System.out.println(Arrays.toString(data));
    }

    static void shake (int[] data)
    {
        int count = 0;
        
        for(int i = 0; i < data.length; i++)
            if(data[i] == 1)
                count++;
        
        for(int i = 0; i < data.length; i++)
        {
            if(i >= data.length - count)
                data[i] = 1;
            else
                data[i] = 0;
        }
    }
}