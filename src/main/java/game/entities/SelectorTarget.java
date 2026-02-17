package game.entities;

import java.util.List;

public class SelectorTarget {


    public void choosePossiblesTargets(Character caster, Skill skill, BattleContext cxt){

        switch (skill.getTypeTarget()){
            case SELF -> skill.cast(List.of(caster));
            case ALL_ALLIES ->  skill.cast(cxt.allies);
            case ALL_ENEMIES -> skill.cast(cxt.enemies);
            case ONE_ALLY -> skill.cast(List.of(caster.chooseOneAlly(cxt.allies)));
            case ONE_ENEMY ->skill.cast(List.of(caster.chooseOneEnemy(cxt.enemies)));
        }

    }

}
