package game.entities;

import game.types.TypeCost;

public class Cost {
    TypeCost typeCost;
    int quality;


    public Cost(int quality, TypeCost typeCost) {
        this.quality = quality;
        this.typeCost = typeCost;
    }
}
