public class MathOperations {
    public int add(int a,int b){ return a+b;}
    public float add(float a,float b){ return a+b;}
    public double add(double a,double b){ return a+b;}
    ////////
    public int sub(int a,int b){ return a-b;}
    public float sub(float a,float b){ return a-b;}
    public double sub(double a,double b){ return a-b;}
    ///////
    public int multiply(int a,int b){ return a*b;}
    public float multiply(float a,float b){ return a*b;}
    public double multiply(double a,double b){ return a*b;}
    //////
    public int divide(int a,int b){ return a/b;}
    public float divide(float a,float b){ return a/b;}
    public double divide(double a,double b){ return a/b;}
    /////
    public static void main(String[] args) {
        MathOperations operations =  new MathOperations();
        System.out.println(operations.add(3,5));
        System.out.println(operations.add(3.0f,5.0f));
        System.out.println(operations.add(3.0,5.0));///////////
        System.out.println(operations.multiply(3,5));
        System.out.println(operations.multiply(3.0f,5.0f));
        System.out.println(operations.multiply(3.0,5.0));//////////
        System.out.println(operations.divide(30,5));
        System.out.println(operations.divide(30.0f,5.0f));
        System.out.println(operations.divide(30.0,5.0));//////////////
        System.out.println(operations.sub(30,5));
        System.out.println(operations.sub(30.0f,5.0f));
        System.out.println(operations.sub(30.0,5.0));
    }
}
