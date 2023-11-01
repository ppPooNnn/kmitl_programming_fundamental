public class Ex1 {
    public static void main(String[] args) {
        int [] [] matrix1 = {   {0, 0, 0, 1},
                                {0, 0, 1, 0},
                                {0, 1, 0, 0},
                                {1, 0, 0, 0}
                            };
        
        int [] [] matrix2 = {   {1, 0, 0, 0},
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {0, 0, 0, 1}
                            };
        System.out.println(triangle_matrix_check(matrix1));
        System.out.println(triangle_matrix_check(matrix2));
    }

    static boolean triangle_matrix_check(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if((i != j && matrix[i][j] != 0))
                    return false;
            }
        }
        return true;
    }
}
