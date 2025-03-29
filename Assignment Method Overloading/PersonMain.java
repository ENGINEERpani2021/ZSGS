class Person {
    String name;
    int age;
    String address;
    public Person(String name){
        this.name=name;
        System.out.println("Constructor1");
    }
    public Person(String name,int age){
        this(name);
        this.age=age;
        System.out.println("Constructor2");
    }
    public Person(String name,int age,String address){
        this(name,age);
        this.address=address;
        System.out.println("Constructor3");
    }
    @Override
    public  String toString(){
        return "Person name: "+this.name+" Id: "+this.age+" Address: "+this.address;
    }
}
public class PersonMain{
    public static void main(String[] args) {
        Person person = new Person("Saradha");
        System.out.println(person.toString());
        person = new Person("Saradha",17);
        System.out.println(person.toString());
        person = new Person("Saradha",17,"Guduvancheri");
        System.out.println(person.toString());
    }
}
