import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemoQ1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> fruitList = new ArrayList<>();
        System.out.println("Enter 5 fruits name: ");
        for(int i=0;i<5;i++){
            fruitList.add(sc.next());
        }
        System.out.println("Third fruit of the list: "+fruitList.get(2));
    }
}
