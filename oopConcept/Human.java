public class Human{
    String name;
    int age;
    int hightInInches;
    String eyeColor;

    public Human(String name, int age, int hightInInches, String eyeColor){
        super();
        this.name = name ;
        this.age = age;
        this.hightInInches = hightInInches;
        this.eyeColor=eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my Namne is "+ name);
        System.out.println("I am "+ hightInInches + " inches tall");
        System.out.println("I am "+ age + " years old");
        System.out.println("My eye color is: "+eyeColor);
    }

    public void eat() {
       System.out.println("eating....");
    }
    public void walk() {
        System.out.println("walking....");
    }
    public void work() {

        System.out.println("working....");
    }
}