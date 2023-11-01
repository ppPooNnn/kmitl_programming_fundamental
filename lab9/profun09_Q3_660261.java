import java.util.Arrays;

class profun09_Q3_660261
{
    public static void main(String[] args)
    {
        int[][] map = { {0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0},
                        {0, 9, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 9, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0},
                        {0, 9, 0, 0, 9, 9, 0, 0, 9, 9, 9, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 0, 0},
                    };
        int[][] marked_map = markMap(map);
        System.out.println("Before mark");
        for(int[] i : map)
            System.out.println(Arrays.toString(i));
        System.out.println("After marked");
        for(int[] j : marked_map)
            System.out.println(Arrays.toString(j));
    }

    static int[][] markMap(int[][] bMap)
    {
        int[][] mMap = new int[bMap.length][bMap[0].length];
        for(int i = 0; i < bMap.length; i++)
        {
            for(int j = 0; j < bMap[i].length; j++)
            {
                if(bMap[i][j] == 9)
                {
                    if(i == 0 && j == 0)
                    {
                        mMap[i][j + 1] += 1;
                        mMap[i + 1][j] += 1;
                        mMap[i + 1][j + 1] += 1;
                    }
                    else if(i == 0)
                    {
                        mMap[i][j + 1] += 1;
                        mMap[i + 1][j] += 1;
                        mMap[i + 1][j + 1] += 1;
                        mMap[i + 1][j - 1] += 1;
                        mMap[i][j - 1] += 1;
                    }
                    else if(i == 0 && j == bMap[0].length - 1)
                    {
                        mMap[i][j - 1] += 1;
                        mMap[i + 1][j] += 1;
                        mMap[i + 1][j - 1] += 1;
                    }
                    else if(j == 0)
                    {
                        mMap[i - 1][j] += 1;
                        mMap[i - 1][j + 1] += 1;
                        mMap[i][j + 1] += 1;
                        mMap[i + 1][j + 1] += 1;
                        mMap[i + 1][j] += 1;
                    }
                    else if(j == bMap[0].length - 1)
                    {
                        mMap[i - 1][j] += 1;
                        mMap[i - 1][j - 1] += 1;
                        mMap[i][j - 1] += 1;
                        mMap[i + 1][j - 1] += 1;
                        mMap[i + 1][j] += 1;
                    }
                    else if(i == bMap.length - 1 && j == 0)
                    {
                        mMap[i][j + 1] += 1;
                        mMap[i - 1][j] += 1;
                        mMap[i - 1][j + 1] += 1;
                    }
                    else if(i == bMap.length - 1 && j == bMap[0].length)
                    {
                        mMap[i][j - 1] += 1;
                        mMap[i - 1][j] += 1;
                        mMap[i - 1][j - 1] += 1;
                    }
                    else if(i == bMap.length - 1)
                    {
                        mMap[i][j + 1] += 1;
                        mMap[i - 1][j] += 1;
                        mMap[i - 1][j + 1] += 1;
                        mMap[i - 1][j - 1] += 1;
                        mMap[i][j - 1] += 1;
                    }
                    else
                    {
                        mMap[i][j + 1] += 1;
                        mMap[i - 1][j] += 1;
                        mMap[i - 1][j + 1] += 1;
                        mMap[i - 1][j - 1] += 1;
                        mMap[i][j - 1] += 1;
                        mMap[i + 1][j] += 1;
                        mMap[i + 1][j - 1] += 1;
                        mMap[i + 1][j + 1] += 1;
                    }
                }
            }
        }
        for(int i = 0; i < bMap.length; i++)
        {
            for(int j = 0; j < bMap[i].length; j++)
            {
                if(bMap[i][j] == 9)
                    mMap[i][j] = 9;
            }
        }
        return mMap;
    }
}