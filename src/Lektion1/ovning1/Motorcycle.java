package Lektion1.ovning1;

public class Motorcycle implements Movable, Soundable {

    @Override
    public void move() {
        System.out.println("Motorcykeln åker!");
    }

    @Override
    public void makeSound() {
        System.out.println("Motor cykeln gör ljud: Vroom!");
    }
}
