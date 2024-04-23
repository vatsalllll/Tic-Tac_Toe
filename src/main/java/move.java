public class move {
    private cell cell;
    private player player;

    public move(cell cell, player player) {
        this.cell = cell;
        this.player = player;
    }

    public cell getCell() {
        return cell;
    }

    public void setCell(cell cell) {
        this.cell = cell;
    }

    public player getPlayer() {
        return player;
    }

    public void setPlayer(player player) {
        this.player = player;
    }
}
