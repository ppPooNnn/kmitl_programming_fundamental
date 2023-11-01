import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<Integer>();

        System.out.println(name);

        for(int i = 0; i < 10; i++)
        {
            name.add(i);
        }
        // name.add(20);
        System.out.println(name);
        name.remove(5);
        System.out.println(name);
        name.add(3, 999);
        System.out.println(name);
        System.out.println("just one value " + name.get(4));
        System.out.println("------------print in for loop-------------------");
        for(int i = 0; i < name.size(); i++) // name.length
        {
            System.out.print(name.get(i) + " "); //name[i]
        }
    }
}
