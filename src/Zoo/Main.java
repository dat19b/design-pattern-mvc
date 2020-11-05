package Zoo;

public class Main {

    public static void main(String[] args) {
        IAnimal tiger = new Lion();
        tiger.makeSound();
        tiger.attack();

    }

}
