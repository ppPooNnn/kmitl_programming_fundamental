public class Lab5Q4_2_660261 
{
    public static void main(String[] args)
    {
        String s1 = "zxcvbnm";
        String s2 = "xyz";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int index = -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
            {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
