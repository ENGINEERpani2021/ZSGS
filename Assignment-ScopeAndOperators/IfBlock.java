public class IfBlock {
    public static void main(String[] args) {
        int x=8;
        if(x>0){
            int y=x+2;
            System.out.println("Inside block scope --> x: "+x+" y: "+y);
        }
        //System.out.println("Inside block scope --> x: "+x+" y: "+y); //compile error-Cannot resolve symbol y
        System.out.println("Outside block scope --> x: "+x);
    }
}
