package Lektion1.ovning1;

public class Bird implements Flyable, Soundable{
    @Override
    public void fly() {
        System.out.println("Fågeln flyger");
    }

    @Override
    public void makeSound() {
        System.out.println("Fågeln kvittrar");
    }
}
