import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double no_Of_Persons =10;
        double sum_Of_Weights =0;
        Scanner input_scan = new Scanner(System.in);
        for(int current_Person = 0; current_Person < no_Of_Persons; current_Person++){
            double weight_Of_A_Person = input_scan.nextDouble();
            sum_Of_Weights += weight_Of_A_Person;
        }
        System.out.println("Average weight of 10 people: "+(sum_Of_Weights / no_Of_Persons));
    }
}
