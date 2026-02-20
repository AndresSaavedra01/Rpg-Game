package game.entities;


public class Battle {

    BattleContext ctx;
    Character characterOnTurn;

    public Battle(BattleContext ctx) {
        this.ctx =  ctx;
    }

    public void loopBattle() {
        while (ctx.isFinish()){
            characterOnTurn = ctx.giveNextTurn();
            characterOnTurn.takeTurn(ctx);
            ctx.passAway();
        }

    }

    public boolean playerOnTur(){
        return characterOnTurn instanceof Player;
    }

    public BattleContext getCtx() {
        return ctx;
    }


    public Character getCharacterOnTurn() {
        return characterOnTurn;
    }

    public void setCharacterOnTurn(Character characterOnTurn) {
        this.characterOnTurn = characterOnTurn;
    }


}
