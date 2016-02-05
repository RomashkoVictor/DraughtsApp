package by.draughts.model.game;

import by.draughts.model.person.Player;

public class GameTitle {
    private Player white;
    private Player black;
    private GameResult result;

    public GameTitle() {
    }

    @Override
    public String toString() {
        return "GameTitle{" +
                "white=" + white +
                ", black=" + black +
                ", result=" + result +
                '}';
    }

    public GameTitle(Player white, Player black) {
        this.white = white;
        this.black = black;
        this.result = GameResult.UNDEFINED;
    }

    public GameTitle(Player white, Player black, GameResult result) {
        this.white = white;
        this.black = black;
        this.result = result;
    }

    public Player getWhite() {
        return white;
    }

    public void setWhite(Player white) {
        this.white = white;
    }

    public Player getBlack() {
        return black;
    }

    public void setBlack(Player black) {
        this.black = black;
    }

    public GameResult getResult() {
        return result;
    }

    public void setResult(GameResult result) {
        this.result = result;
    }
}
