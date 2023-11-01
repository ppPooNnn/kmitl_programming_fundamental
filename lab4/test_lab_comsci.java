public class test_lab_comsci {
    public static void main(String[] args)
    {
        //int[] d = {9, 20, 6, 10, 14, 8, 60, 11};
        int[] d = {3, 11, 13, 14, 15, 17, 19, 22};
        int markIdx, iter, magic;
        markIdx = 0;
        iter = 1; 
        magic = 0;
        int tmp;
        tmp = 0;
        for(markIdx = 0; markIdx < d.length; markIdx++)
        {
            // if(iter == 5)
            // {
            //     System.out.println("tmp is " + tmp);
            // }
            iter = markIdx;
            for(int currentExamineIdx = 1 /*+ markIdx*/; currentExamineIdx < d.length; currentExamineIdx++)
            {
                if(d[currentExamineIdx] < d[markIdx])
                {
                    //System.out.println(d[currentExamineIdx] + " swap with " + d[markIdx]);
                    markIdx = currentExamineIdx;
                    magic++;
                }
            }
            //System.out.println(d[iter]+" swap with " +d[markIdx]);
            tmp = d[iter];
            if(iter == 5)
            {
                System.out.println("tmp is " + tmp);
            }
            d[iter] = d[markIdx];
            d[markIdx] = tmp;
            for(int i = 0; i < d.length; i++)
            {
                System.out.print(d[i] + " ");
            }
            System.out.println();
            //markIdx = iter;
        }
        System.out.println("show magic " + magic);
    }
}
