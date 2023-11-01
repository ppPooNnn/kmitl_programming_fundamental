import java.util.Arrays;

public class ProFun09_660261
{
    public static void main(String... args) {
        
        // q2();
        q3_markTheBomb();
        /* Q1 could take sometime to understand the idea, solve q1 last. */
        // q1();
    }



    static void q1() {
        System.out.println("-q1----");
        int [] template = {0,1,0,1,1,0,0,0,1};
        int [] data = new int [template.length];
        System.arraycopy(template, 0, data, 0, template.length);
        q1_supernavie(data);
        System.arraycopy(template, 0, data, 0, template.length);
        q1_improve_naive(data); 
        System.arraycopy(template, 0, data, 0, template.length);
        q1_transform(data);

    }
    static void q1_supernavie(int [] data) {
        int goLeft, goRight;
        for (int i = 0; i < data.length; i++) {

            for (goLeft = 0; goLeft < data.length; goLeft++)
                if (data[goLeft] == 1)
                    break;
            for (goRight = data.length - 1; goRight >= 0; goRight--)
                if (data[goRight] == 0)
                    break;

            if (goLeft < goRight) { 
                int tmp = data[goLeft];
                data[goLeft] = data[goRight];
                data[goRight] = tmp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
    static void q1_improve_naive(int [] data) {
        // not so easy, you may consider doing this later
        int n = data.length;
        int left = 0;
        int right = n - 1;
        while(left < right)
        {
            while(left < right && data[right] == 1)
            {
                right--;
            }
            while(left < right && data[left] == 0)
            {
                left++;
            }
            int tmp = data[left];
            data[left] = data[right];
            data[right] = tmp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(data));
    }
    static void q1_transform(int [] data) {
        int count = 0;
        for(int i = 0; i < data.length; i++)
        {
            if(data[i] == 0)
                count++;
            if(data[i] == 1)
                data[i] = 0;
        }

        for(int i = count; i < data.length; i++)
        {
            data[i] = 1;
        }
        System.out.println(Arrays.toString(data));
    }



    static void q2() {
        // 
        int [][] data = {   {11,12,13,14}, 
                            {15,16,17,18},
                            {19,20,21,22},
                            {23,24,25,26},
                            {27,28,29,30} };
        System.out.println("-q2----");
        q2_flip_by_new_array(data);
        System.out.println("way2");
        q2_flipHorizontal_inplace(data);
        for (int row = 0; row < data.length; row++) {
                System.out.println(Arrays.toString(data[row]));
        }        
        System.out.println("way3");
        q2_swap_rows(data);
        for (int row = 0; row < data.length; row++) {
                System.out.println(Arrays.toString(data[row]));
        }
    }
    static void q2_flip_by_new_array(int [][] data) {
        int [][] hori = flipHorizontal(data);
        for (int row = 0; row < data.length; row++) {
                System.out.println(Arrays.toString(hori[row]));
        }
    }

    static int[][] flipHorizontal(int [][] img) {
        int [][] aRef = new int[img.length][img[0].length];
        int r2 = img.length - 1;
        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[row].length; col++) {
                aRef[r2 - row][col] = img[row][col];
            }
        }
        return aRef;
    }
    static void q2_flipHorizontal_inplace(int [][] img) {
        int tmp = 0;
        for (int row = 0; row < img.length / 2; row++) {
            for(int column = 0; column < img[0].length; column++)
            {
                tmp = img[row][column];
                img[row][column] = img[img.length - row - 1][column];
                img[img.length - row - 1][column] = tmp;
            }
            // System.out.println();
        }
    }
    static void q2_swap_rows(int [][] img) {
        // idea is 
        // swap(row_0, row_n-1)
        // swap(row_1, row_n-1 - i)
        int[] tmp = new int[img[0].length];
        for (int row = 0; row < img.length/2; row++) {
            tmp = img[row];
            img[row] = img[img.length - row - 1];
            img[img.length - row - 1] = tmp;
            // System.out.println();
        }
    }



    static void q3_markTheBomb() {
        int[][] map = { { 0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                        { 0, 9, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 9, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0 },
                        { 0, 9, 0, 0, 9, 9, 0, 0, 9, 9, 9, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 0, 0 }
        };
        int[][] map2 = new int[map.length][map[0].length];
        int row = 0;
        int col = 0;
        initialMap2(map, map2);
        markTheBomb(map2);
        for (row = 0; row < map2.length; row++) {
            System.out.println(Arrays.toString(map[row]) + "\t" + Arrays.toString(map2[row]));
        }
    }

    static void initialMap2(int[][] map, int[][] map2) {
        int row = 0;
        int col = 0;
        for (row = 0; row < map.length; row++) {
            for (col = 0; col < map[0].length; col++) {
                map2[row][col] = map[row][col];
            }
        }
    }

    static void markTheBomb(int[][] map2) {
        int row_len = map2.length;
        int column_len = map2[0].length;
        for(int row = 0; row < row_len; row++)
        {
            for(int column = 0; column < column_len; column++)
            {
                int bomb_count = 0;
                if(map2[row][column] == 9)
                    continue;

                if(column + 1 < column_len && map2[row][column + 1] == 9)
                    bomb_count++;

                if(column + 1 < column_len && row + 1 < row_len && map2[row + 1][column + 1] == 9)
                    bomb_count++;

                if(column - 1 >= 0 && map2[row][column - 1] == 9)
                    bomb_count++;

                if(column - 1 >= 0 && row + 1 < row_len && map2[row + 1][column - 1] == 9)
                    bomb_count++;

                if(row + 1 < row_len && map2[row + 1][column] == 9)
                    bomb_count++;

                if(row - 1 >= 0 && map2[row - 1][column] == 9)
                    bomb_count++;

                if(row - 1 >= 0 && column - 1 >= 0 && map2[row - 1][column - 1] == 9)
                    bomb_count++;

                if(row - 1 >= 0 && column + 1 < column_len && map2[row - 1][column + 1] == 9)
                    bomb_count++;

                map2[row][column] = bomb_count;
            }
        }
    }
}
