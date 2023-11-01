class MovieCounter_main 
{
    public static void main(String[] args)
    {
        MovieCounter_660261 location1 = new MovieCounter_660261();
        MovieCounter_660261 location2 = new MovieCounter_660261();

        System.out.println("location 1");
        location1.showAvailableList();
        System.out.println("location 2");
        location2.showAvailableList();

        System.out.println("-----------------------------------------------------------------");

        System.out.println("location 1");
        location1.checkout(1);
        location1.showCheckoutList();
        location1.showAvailableList();

        System.out.println("location2");
        location2.checkout(2);
        location2.showCheckoutList();
        location2.showAvailableList();
    }
}
