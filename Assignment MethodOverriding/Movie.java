package pack;
public class Movie {
    public Movie(String movieId, String movieName, String description){
        this.movieId=movieId;
        this.movieName=movieName;
        this.description=description;
    }
    private static long totalMovies;
    private String movieId;
    private String movieName;
    private String description;

    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
class RomComMovie extends Movie{
    private String genre = "RowCom";

    public RomComMovie(String movieId, String movieName, String description) {
        super(movieId, movieName, description);
    }

    public String getGenre() {
        return genre;
    }
    @Override
    public String getDescription() {
        return "This movie belongs to "+this.getGenre()+" genre. "+super.getDescription();
    }
}
class Thriller extends Movie{
    private String genre = "Thriller";

    public Thriller(String movieId, String movieName, String description) {
        super(movieId, movieName, description);
    }

    public String getGenre() {
        return genre;
    }
    @Override
    public String getDescription() {
        return "This movie belongs to "+this.getGenre()+" genre. "+super.getDescription();
    }
}
class Horror extends Movie{
    private String genre = "Horror";

    public Horror(String movieId, String movieName, String description) {
        super(movieId, movieName, description);
    }

    public String getGenre() {
        return genre;
    }
    @Override
    public String getDescription() {
        return "This movie belongs to "+this.getGenre()+" genre. "+super.getDescription();
    }
}