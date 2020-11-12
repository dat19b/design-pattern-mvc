package strategy;

public class Main {

    public static void main(String[] args) {
        IWeapon weapon = null;
        Character drEvil = new Character();

        drEvil.setWeapon(new Axe());
        drEvil.attack();
        drEvil.setWeapon(new Club());
        drEvil.attack();
    }
}
