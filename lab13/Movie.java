class Movie 
{
    String title;
    int releasedYear;
    double rating;

    Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releasedYear = releaseYear;
        this.rating = rating;
    }
    
    String getTitle()
    {
        return this.title;
    }

    int getReleasedYear()
    {
        return this.releasedYear;
    }

    double getRating()
    {
        return this.rating;
    }

    @Override
    public String toString() {
        return title + "(" + releasedYear + ", " + rating + ")";
    }

    
}
