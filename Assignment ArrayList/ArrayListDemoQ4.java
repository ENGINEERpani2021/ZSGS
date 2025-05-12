import java.util.*;

public class ArrayListDemoQ4{
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=0;i<10;i++){   //can't set size of empty list as list.size()
            list.add(random.nextInt(101));
        }
        System.out.println("Before sorting: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);
    }
}