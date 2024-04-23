public class cell {
    public int row;
    public int column;
    public player player;
    public cellstate state;

    public cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.state = cellstate.EMPTY;
        this.player = null; // Initially no player occupies the cell
    }
}
