package pack;
public class Movie {
    Movie(){
        this.totalMovies++;
    }
    public Movie(String movieId, String movieName,String director, String actorName, String description){
        this();
        this.movieId=movieId;
        this.movieName=movieName;
        this.director=director;
        this.actorName=actorName;
        this.description=description;
    }
    private static long totalMovies;
    private String movieId;
    private String movieName;
    private String director;
    private String actorName;
    private String description;

    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActorName() {
        return actorName;
    }
    public void setActorName(String actorName) {
        this.actorName = actorName;
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
    public static long getTotalMovies() {
        return totalMovies;
    }
}
