import java.util.Scanner;

public class EnumExample {
    enum DaysOfWeek {
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entera a valid number between 0-6: ");
        int day = sc.nextInt();
        switch(day){
            case 0:{
                System.out.println(DaysOfWeek.SUNDAY);
                break;
            }
            case 1:{
                System.out.println(DaysOfWeek.MONDAY);
                break;
            }
            case 2:{
                System.out.println(DaysOfWeek.TUESDAY);
                break;
            }
            case 3:{
                System.out.println(DaysOfWeek.WEDNESDAY);
                break;
            }
            case 4:{
                System.out.println(DaysOfWeek.THURSDAY);
                break;
            }
            case 5:{
                System.out.println(DaysOfWeek.FRIDAY);
                break;
            }
            case 6:{
                System.out.println(DaysOfWeek.SATURDAY);
                break;
            }
            default: System.out.println("Please enter a valid number between 0-6");
        }
    }
}
