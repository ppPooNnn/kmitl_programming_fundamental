import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ProFun13_ReadCSV660261
{
    public static void main(String[] args)
    {
        // demo1();
        // demo2();
        // demo3();
        demo4();
    }

    static void demo1()
    {
        try (Scanner input = new Scanner(Paths.get("movies.csv")))
        {
            while(input.hasNext())
            {
                String line = input.nextLine();
                String[] tokens = line.split(",");
                System.out.println(Arrays.toString(tokens));
            }
        }
        catch (Exception e)
        {

        }
    }

    static void demo2()
    {
        try (Scanner input = new Scanner(Paths.get("movies.csv")))
        {
            while(input.hasNext())
            {
                String line = input.nextLine();
                String[] tokens = line.split(",");
                Movie m = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                System.out.println(m);
            }
        }
        catch (Exception e)
        {

        }
    }

    static void demo3()
    {
        int rowNum = 0;

        try (Scanner input = new Scanner(Paths.get("movies2.csv")))
        {
            while(input.hasNext())
            {
                String line = input.nextLine();
                String[] tokens = line.split(",");
                try
                {
                    Movie m = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                    System.out.println(m);
                    rowNum++;
                }
                catch (Exception e)
                {
                    System.out.println("At row " + rowNum + ", exception named " + e + "... skip");
                    continue;
                }
            }
        }
        catch (Exception e)
        {
        }
    }

    static void demo4()
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        try (Scanner input = new Scanner(Paths.get("movies2.csv")))
        {
            while(input.hasNext())
            {
                String line = input.nextLine();
                // System.out.println("print after nextLine " + line);
                String[] tokens = line.split(",");
                try
                {
                    Movie m = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                    // System.out.println(tokens[0]);
                    // System.out.println(tokens[1]);
                    // System.out.println(tokens[2]);
                    list.add(m);
                    // System.out.println("print object " + m);
                }
                catch (Exception e)
                {
                    continue;
                }
                // System.out.println("--------------------------------------------");
            }

            for(Movie m : list)
            {
                System.out.println(m.title);
            }
        }
        catch (Exception e)
        {
        }
    }
}