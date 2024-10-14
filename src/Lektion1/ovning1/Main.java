package Lektion1.ovning1;

public class Main {
    public static void main(String[] args) {
        /*
        Car newCar = new Car();
        Bicycle newBicycle = new Bicycle();
        Motorcycle newMotorcycle = new Motorcycle();
        Airplane newAirplane = new Airplane();
        Bird newBird = new Bird();

        newCar.move();
        newBicycle.move();
        newMotorcycle.move();
        newMotorcycle.makeSound();
        newBird.fly();
        newBird.makeSound();
        newAirplane.fly();
        newAirplane.makeSound();
         */

        Calculator newCalculator = new Calculator();

        System.out.println(newCalculator.add(10,20));
        System.out.println(newCalculator.add(10,20,30));
        System.out.println(newCalculator.add(10.5,20.3));

        AccountManager accountManager = new AccountManager();

        accountManager.createAccount("user1");

        accountManager.createAccount("user2", "securePassword");

        accountManager.createAccount("user3", "securePassword", "user3@example.com");

    }
}
