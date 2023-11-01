import java.util.Arrays;

class profun09_Q2_660261 
{
    public static void main(String[] args)
    {
        int[][] data = { {11, 12, 13, 14},
                         {15, 16, 17, 18},
                         {19, 20, 21, 22},
                         {23, 24, 25, 26},
                         {27, 28, 29, 30}
                        };
        int[][] hori = flipHorizontal(data);

        System.out.println("Original");
        for(int[] i : data)
            System.out.println(Arrays.toString(i));

        System.out.println("Horizontal result");
        for(int[] j : hori)
            System.out.println(Arrays.toString(j));
    }

    static int[][] flipHorizontal(int[][] data)
    {
        int[][] result = new int[data.length][data[0].length];
        int last_row = data.length - 1;

        for(int i = 0; i <= last_row; i++)
        {
            result[i] = data[last_row - i];
        }
        return result;
    }
}
