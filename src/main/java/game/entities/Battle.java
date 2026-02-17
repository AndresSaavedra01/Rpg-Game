package game.entities;


public class Battle {

    BattleContext ctx;
    Character characterOnTurn;

    public Battle(BattleContext ctx) {
        this.ctx =  ctx;
        loopBattle();
    }

    private void loopBattle() {
        while (ctx.isFinish()){
            characterOnTurn = ctx.giveNextTurn();
            characterOnTurn.takeTurn(ctx);
            ctx.passAway();
        }

    }
}
