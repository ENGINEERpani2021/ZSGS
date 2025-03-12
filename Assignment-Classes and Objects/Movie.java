public class Movie {
    Movie(){
        this.totalMovies++;
    }
    private static long totalMovies;
    private String movieId;
    private String Director;
    private String actorName;
    private String actressName;
    private String MusicDirector;
    private String description;

    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getDirector() {
        return Director;
    }
    public void setDirector(String director) {
        Director = director;
    }
    public String getActorName() {
        return actorName;
    }
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
    public String getActressName() {
        return actressName;
    }
    public void setActressName(String actressName) {
        this.actressName = actressName;
    }
    public String getMusicDirector() {
        return MusicDirector;
    }
    public void setMusicDirector(String musicDirector) {
        MusicDirector = musicDirector;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public static long getTotalMovies() {
        return totalMovies;
    }
}
