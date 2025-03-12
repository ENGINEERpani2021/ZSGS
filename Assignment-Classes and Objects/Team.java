import java.util.ArrayList;
import java.util.List;

class Player{
    public String name;
    public String position;
    public int jerseyNumber;
    public void playGame(){
        System.out.println("inside Player...");
    }
    public void train(){
        System.out.println("Player-in-training...");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
}
public class Team {
    public String name;
    public String city;
    public String division;
    public static List<Player> player=new ArrayList<>();
    public void playGame(){
        System.out.println("inside Team...");
    }
    public void hireCoach(){
        System.out.println("Looking for coach...");
    }
    public void addPlayer(Player P){
        this.player.add(P);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
}
