import java.util.*;

public class ArrayListDemoQ5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");fruitList.add("banana");fruitList.add("cherry");
        Object[] fruitArrays =fruitList.toArray(); // not String[]
        System.out.println("As Array: "+Arrays.toString(fruitArrays));
        System.out.println("As List: "+Arrays.asList(fruitArrays));
    }
}