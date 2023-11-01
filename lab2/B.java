public class B {
    public static void main(String[] args){
        int a = 47,b = 8;
        int sum = 0;
        int c = 0;
        //a = b*sum + c
        while ((b * sum) < a)
        {
            sum++;
        }
        //sum = 6
        c = a - (b * (sum - 1)); // sum = 5 therefor 5 * 8 = 40 and 47 - 40 is 7
        System.out.println("check ans is " + (a % b) + ": check " + c);
    }
}
/*        int x = 5;
        int y = 4;
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + " y = " + y); */
/*
set a,b = 0;
input a,b;
set sum = 1;
 */