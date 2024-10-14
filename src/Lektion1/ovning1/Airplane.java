package Lektion1.ovning1;

public class Airplane implements Flyable, Soundable{
    @Override
    public void fly() {
        System.out.println("Flygplanet flyger");
    }

    @Override
    public void makeSound() {
        System.out.println("Flygplanets motor låter");
    }
}
