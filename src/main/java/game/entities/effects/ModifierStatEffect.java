package game.entities.effects;


import game.entities.Character;
import game.types.TypeStat;
import game.types.TypeModifierStat;

import java.util.List;

public class ModifierStatEffect implements Effect{

    int value;
    TypeStat typeStat;
    TypeModifierStat typeModifierStat;

    public ModifierStatEffect(int value, TypeStat typeStat, TypeModifierStat typeModifierStat) {
        this.value = value;
        this.typeStat = typeStat;
        this.typeModifierStat = typeModifierStat;
    }

    @Override
    public void apply( List<Character> targets) {
        for(Character character: targets){
            character.modifyStat(value, typeStat, typeModifierStat);
        }
    }
}
