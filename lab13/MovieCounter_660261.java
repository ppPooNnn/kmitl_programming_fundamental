import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class MovieCounter_660261 
{
    ArrayList<Movie> availableList = new ArrayList<Movie>();
    ArrayList<Movie> checkOutList = new ArrayList<Movie>();

    

    public MovieCounter_660261() 
    {
        try (Scanner input = new Scanner(Paths.get("movies2.csv")))
        {
            while(input.hasNext())
            {
                String line = input.nextLine();
                String[] tokens = line.split(",");
                try
                {
                    Movie m = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                    this.availableList.add(m);
                }
                catch (Exception e)
                {
                    continue;
                }
            }
        }
        catch (Exception e)
        {
        }
    }

    void showAvailableList()
    {
        System.out.println("The following titles are available");
        for (Movie m : availableList)
        {
            System.out.println(m);
        }
    }

    void showCheckoutList()
    {
        System.out.println("The following titles have been checked out.");
        for (Movie m : checkOutList)
        {
            System.out.println(m);
        }
    }

    void checkout(int index)
    {
        this.checkOutList.add(availableList.get(index));
        this.availableList.remove(index);
    }
}
