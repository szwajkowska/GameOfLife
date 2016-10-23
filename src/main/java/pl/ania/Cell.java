package pl.ania;

public class Cell {

    private final boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public boolean checkNeighbours(int i) {
        if (alive) {
            if (i < 2 || i > 3) {
                return false;
            }

        } else {
            if (i == 3) {
                return true;
            }
        }

        return alive;
    }
}
