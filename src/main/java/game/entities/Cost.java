package game.entities;

public class Cost {
    public enum TypeCost{
        COST_HP,
        COST_SP
    }
    TypeCost typeCost;
    int quality;

    public Cost(int quality, TypeCost typeCost) {
        this.quality = quality;
        this.typeCost = typeCost;
    }
}
