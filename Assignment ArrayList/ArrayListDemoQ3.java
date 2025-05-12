public class ArrayListDemoQ3{
    static List<Character> list = new ArrayList<>(Arrays.asList('a','e','i','o','u','b','c','d','f'));
    static  int findCharacter(char c){
        for (int i =0;i< list.size();i++) {
            if(list.get(i).compareTo(c)==0)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayListDemo list = new ArrayListDemo();
        System.out.println(findCharacter('u'));
    }
}