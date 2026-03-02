package game.model;

public class Character {
    private Stat life;
    private int attack;
    private int speed;
    private int armature;
    private int healing;


    public Character(Stat life,int attack, int speed, int armature, int healing) {
        this.life = life;
        this.attack =  attack;
        this.speed = speed;
        this.armature = armature;
        this.healing = healing;
    }

    private void attack(Character target){
        target.takeDamage(this.attack);
    }

    private void takeDamage(int attack) {
        this.life.decrease(resultDamage(attack));
    }

    private int resultDamage(int attack){
        return attack - (attack * this.armature)/100;
    }

    public boolean isDead(){
        return life.isZero();
    }

    public void takeTurn(CharactersManager manager){
        switch (selectAction()){
            case 1 -> attack(chooseEnemy(manager));
            case 2 -> guard();
            case 3 -> healing(chooseAlly(manager));

        }

    }

    private void healing(Character target) {
    }

    private Character chooseAlly(CharactersManager manager) {
        return null;
    }

    private void guard() {

    }

    private Character chooseEnemy(CharactersManager manager) {
        return null;
    }

    private int selectAction() {
        return 1;
    }

    public Stat getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmature() {
        return armature;
    }

    public int getHealing() {
        return healing;
    }
}
