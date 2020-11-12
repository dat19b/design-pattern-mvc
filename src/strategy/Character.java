package strategy;

public class Character {

    IWeapon weapon;

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        weapon.use();
    }
}
