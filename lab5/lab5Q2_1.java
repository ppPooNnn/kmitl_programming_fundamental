public class lab5Q2_1 {
    public static void main(String[] args)
    {
        String str = "asdf";
        int length = str.length() - 1;
        int check = 1;
        for(int i = 0; i <= length; i++)
        {
            if(!(str.charAt(i) == str.charAt(length - i)))
                check = 0; break;
        }
        System.out.println(check);
    }
}
