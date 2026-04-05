package game.model.entities;


public class Character {

    private final String name;
    private final Side side;
    private final Stats stats;

    private boolean inGuard = false;


    public Character(String name, Side side, Stats stats) {
        this.name = name;
        this.side = side;
        this.stats = stats;
    }


    public void takeDamage(int value){
        stats.life.decrease(resultDamage(value));
    }

    public void takeHealing(int value){
        stats.life.increment(value);
    }

    private int resultDamage(int value) {
        if(inGuard){
            inGuard =  false;
            return (value - (value * stats.armature.getCurrent() / 100)) - value * 30 / 100;
        } else return  (value - (value * stats.armature.getCurrent() / 100));
    }

    public void attack(Character target){
        target.takeDamage(getAttack().getCurrent());
    }

    public void healing(Character target){
        target.takeHealing(getHealing().getCurrent());
    }

    public void guard(){
        inGuard = true;
    }

    public String getName() {
        return name;
    }

    public Side getSide() {
        return side;
    }

    public boolean isAlive(){
        return !getLife().isZero();
    }

    public boolean isEnemy(){
        return side.equals(Side.ENEMY);
    }

    public boolean isAlly(){
        return side.equals(Side.ALLY);
    }

    public Stat getLife() {
        return stats.life;
    }


    public Stat getAttack() {
        return stats.attack;
    }

    public Stat getSpeed() {
        return stats.speed;
    }


    public Stat getArmature() {
        return stats.armature;
    }


    public Stat getHealing() {
        return stats.healing;
    }


}
