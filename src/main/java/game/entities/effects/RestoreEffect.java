package game.entities.effects;

import game.entities.Character;
import game.types.TypeRestore;

import java.util.List;

public class RestoreEffect implements Effect{
    TypeRestore typeRestore;
    int value;

    public RestoreEffect(TypeRestore typeRestore, int value) {
        this.typeRestore = typeRestore;
        this.value = value;
    }

    @Override
    public void apply(List<Character> targets) {
        switch (typeRestore){
            case RESTORE_HP ->restoreSP(targets);
            case RESTORE_SP ->restoreHP(targets);
        }

    }

    private void restoreSP(List<Character> targets){
        for (Character character: targets){
            character.restoreSP(value);
        }
    }

    private void restoreHP(List<Character> targets){
        for (Character character: targets){
            character.restoreHP(value);
        }
    }

}
