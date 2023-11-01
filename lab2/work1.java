public class work1 {
    public static void main(String[] args){
        int a = 9;
        int b = 12;
        int c = 3;
        int x = a - b / 3 + c * 2 - 1;
        int y = a - b / (3 + c) * (2 - 1);
        int z = a - (b / (3 + c) * 2) - 1;

        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b / (3 + c));
    }
}