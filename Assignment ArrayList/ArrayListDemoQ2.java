import java.util.*;

public class ArrayListDemoQ2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Iterator iterator = list.iterator();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i)>30){
                list.remove(i--);
            }
        }
        System.out.println(list);
    }
}