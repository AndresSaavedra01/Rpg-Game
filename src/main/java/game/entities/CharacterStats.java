package game.entities;


import static game.types.TypeStat.*;

public class CharacterStats {

    private Stat speed;
    private Stat level;
    private Stat maxHP;
    private Stat maxSP;
    private Stat damage;
    private Stat accuracy;
    private Stat defense;
    private Stat dodge;
    private Stat currentHP;
    private Stat currentSP;


    public CharacterStats(int speed, int dodge, int defense, int accuracy, int damage, int maxSP, int maxHP, int level) {
        this.speed = new Stat(speed,SPEED);
        this.dodge = new Stat(dodge, DODGE);
        this.damage = new Stat(damage,DAMAGE);
        this.defense = new Stat(defense, DEFENSE);
        this.accuracy = new Stat(accuracy,ACCURACY);
        this.maxHP = new Stat(maxHP, MAX_HP);
        this.maxSP = new Stat(maxSP,MAX_SP);
        this.currentHP = new Stat(maxHP, MAX_HP);
        this.currentSP = new Stat(maxSP,MAX_SP);
        this.level = new Stat(level, LEVEL);

    }

    public Stat getSpeed() {
        return speed;
    }

    public void setSpeed(Stat speed) {
        this.speed = speed;
    }

    public Stat getLevel() {
        return level;
    }

    public void setLevel(Stat level) {
        this.level = level;
    }

    public Stat getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Stat maxHP) {
        this.maxHP = maxHP;
    }

    public Stat getMaxSP() {
        return maxSP;
    }

    public void setMaxSP(Stat maxSP) {
        this.maxSP = maxSP;
    }

    public Stat getDamage() {
        return damage;
    }

    public void setDamage(Stat damage) {
        this.damage = damage;
    }

    public Stat getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Stat accuracy) {
        this.accuracy = accuracy;
    }

    public Stat getDefense() {
        return defense;
    }

    public void setDefense(Stat defense) {
        this.defense = defense;
    }

    public Stat getDodge() {
        return dodge;
    }

    public void setDodge(Stat dodge) {
        this.dodge = dodge;
    }

    public Stat getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(Stat currentHP) {
        this.currentHP = currentHP;
    }

    public Stat getCurrentSP() {
        return currentSP;
    }

    public void setCurrentSP(Stat currentSP) {
        this.currentSP = currentSP;
    }
}
