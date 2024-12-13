package pkg;

public class Movie{
    
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie (String movieName, double rating, int numRatings, int revenue){
        
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;

    }
    
    public Movie(){
    
        
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;

    }
    
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println("\n");
    }
    
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    
    public void addRating(double rating){
        this.rating = rating;
    }

    public boolean compareRatings(Movie movie){
        if (rating>movie.getRating()){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
