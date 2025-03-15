package pack;

import java.util.ArrayList;
import java.util.List;

public class MovieDisplay {
    List<Movie> movieList;
    public MovieDisplay(){
        this.movieList=new ArrayList<>();
    }
    public long getMoviesCount(){
        return Movie.getTotalMovies();
    }
    public void displayMovies(){
        for (Movie m: this.movieList) {
            System.out.println(m.getMovieId()+"-->"+m.getMovieName()+"-->"+m.getDirector()+"-->"+m.getDescription()+"-->"+m.getActorName());
        }
    }
    public static void main(String[] args) {
        MovieDisplay movieDisplay = new MovieDisplay();
        Movie m = new Movie("5678","dragon","Pradeep","Pradeep","aaaaaaaa");
        movieDisplay.movieList.add(m);
        System.out.println("Movies count: "+movieDisplay.getMoviesCount());
        movieDisplay.displayMovies();
    }

}
