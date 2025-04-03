package pack;
abstract class Movie {
    public Movie(String movieId, String movieName){
        this.movieId=movieId;
        this.movieName=movieName;
    }
    private String movieId;
    private String movieName;

    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public abstract String getDescription();
    public abstract void setDescription(String description);
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
class RomComMovie extends Movie{
    private String genre = "RowCom";
    private String description;

    public RomComMovie(String movieId, String movieName, String description) {
        super(movieId, movieName);
        setDescription(description);
    }

    public String getGenre() {
        return genre;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = "This movie belongs to "+this.getGenre()+" genre. "+description;
    }
}
class Thriller extends Movie{
    private String genre = "Thriller";
    private String description;

    public Thriller(String movieId, String movieName, String description) {
        super(movieId, movieName);
        setDescription(description);
    }

    public String getGenre() {
        return genre;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = "This movie belongs to "+this.getGenre()+" genre. "+description;
    }
}
class Horror extends Movie{
    private String genre = "Horror";
    private String description;

    public Horror(String movieId, String movieName, String description) {
        super(movieId, movieName);
        setDescription(description);
    }

    public String getGenre() {
        return genre;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = "This movie belongs to "+this.getGenre()+" genre. "+description;
    }
}