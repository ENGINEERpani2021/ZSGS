package pack;

import java.util.ArrayList;
import java.util.List;
public class MovieDisplay {
    List<Movie> movieList;
    public MovieDisplay(){
        this.movieList=new ArrayList<>();
    }
    public void displayMovies(){
        for (Movie m: this.movieList) {
            System.out.println(m.getMovieId()+"-->"+m.getMovieName()+"-->"+m.getDescription());
        }
    }
    public static void main(String[] args) {
        MovieDisplay movieDisplay = new MovieDisplay();
        Movie m1 = new RomComMovie("5678","Dragon","aaaaaaaa");
        Movie m2 = new Thriller("5679","Ratchasan","bbbbbbbb");
        Movie m3 = new Horror("5680","Conjuring","cccccccc");
        movieDisplay.movieList.add(m1);
        movieDisplay.movieList.add(m2);
        movieDisplay.movieList.add(m3);
        movieDisplay.displayMovies();
    }

}
