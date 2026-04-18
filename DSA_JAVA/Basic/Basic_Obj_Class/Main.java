public class Main{
    int age;
    String name;

    public static void main(String[] args){
        Main o1 = new Main();
            System.out.println("Hello World");
            System.out.println("age "+o1.age);
            System.out.println("name "+o1.name);
            o1.age=18;
            System.out.println("New age "+o1.age);
            o1.name = "Akshay";
            System.out.println(o1.name);

    }
}