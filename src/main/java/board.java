import java.util.*;
public class board {
    private int size;
    private List<List<cell>> cells;

    public board(int size, List<List<cell>> cells) {
        this.size = size;
        this.cells = cells;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<cell>> cells) {
        this.cells = cells;
    }

}
