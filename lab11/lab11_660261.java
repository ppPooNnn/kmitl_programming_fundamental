import java.util.*;

class lab11_660261
{
    public static void main(String[] args)
    {
        // test_let_s_count();
        // test_transpose();
        test_by_points();
    }

    static void test_let_s_count()
    {
        int [][] map = { {0, 1, 9, 1, 0, 0, 2, 9, 4, 2, 1, 0, 0}, 
                         {1, 3, 3, 3, 1, 1, 2, 9, 9, 9, 1, 0, 0}, 
                         {2, 9, 9, 3, 9, 3, 2, 3, 4, 4, 2, 1, 0}, 
                         {3, 9, 4, 4, 9, 9, 2, 2, 9, 5, 9, 2, 0}, 
                         {2, 9, 2, 2, 9, 9, 2, 2, 9, 9, 9, 3, 0}, 
                         {1, 1, 1, 1, 2, 2, 2, 3, 5, 6, 9, 2, 0}, 
                         {0, 0, 0, 0, 0, 0, 2, 9, 9, 9, 2, 1, 0}, 
                         {0, 0, 0, 0, 0, 0, 2, 9, 9, 3, 1, 0, 0} };
        int count = let_s_count(map);
        System.out.println(count);
    }
    static int let_s_count(int [][] map)
    {
        int count = 0;
        for(int row = 0; row < map.length; row++)
        {
            for(int col = 0; col < map[0].length; col++)
            {
                if(map[row][col] == 9)
                    count++;
            }
        }
        return count;
    }
    
    static void test_transpose()
    {
        int [][] a = {  {1, 2, 3},
                        {4, 5, 6}
                     };
        int [][] b =transpose(a);
        for(int i = 0; i < b.length; i++)
            System.out.println(Arrays.toString(b[i]));
    }
    static int [][] transpose(int [][] a)
    {
        int m = a.length;
        int n = a[0].length;
        int [][] res = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                res[i][j] = a[j][i];
            }
        }
        return res;
    }


    static void test_by_points()
    {
        int [] team_id = {22, 11, 33};
        int [] points = {88, 99, 77};
        by_points(team_id, points);
    }
    static void by_points(int [] teams, int [] points)
    {
        int team = teams.length;
        int [][] res = new int[team][2];
        int max_point = 0;
        int max_point_team = 0;

        for(int iter = 0; iter < team; iter++)
        {
            max_point = points[iter];
            for(int i = iter + 1; i < team - 1; i++)
            {
                if(points[i] > max_point)
                {
                    max_point = points[i];
                    points[i] = points[iter];
                    points[iter] = max_point;
                    max_point_team = teams[i];
                    teams[i] = teams[iter];
                    teams[iter] = max_point_team;
                }
            }
            res[iter][0] = teams[iter];
            res[iter][1] = points[iter];

        }
        for(int [] row : res)
            System.out.println(Arrays.toString(row));
    }
}